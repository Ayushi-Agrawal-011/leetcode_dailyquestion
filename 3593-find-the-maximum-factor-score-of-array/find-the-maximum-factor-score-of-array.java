class Solution {
    public long maxScore(int[] nums) {
        
        if(nums.length==1)
        return (long)nums[0]*nums[0];
         long ans = 0;

        // Without removing any element
        long lo = 1, go = 0;

        for (int x : nums) {
            lo = lcm(lo, x);
            go = gcd(go, x);
        }

        ans = lo * go;
        for(int i=0;i<nums.length;i++){
           long l=1,g=0;
            for(int j=0;j<nums.length;j++ ){
                if(i==j)
                continue;
                l=lcm(l,nums[j]);
                g=gcd(g,nums[j]);
              
            }
            ans=Math.max(ans,l*g);
        }
        return ans;
    }
    public static long gcd(long a, long b) {
    while (b != 0) {
        long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
public static long lcm(long a, long b) {
    return (a / gcd(a, b)) * b;
}
}
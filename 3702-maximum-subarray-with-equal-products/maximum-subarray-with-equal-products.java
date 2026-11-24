class Solution {
    public int maxLength(int[] nums) {
  int ans=1;
for(int i=1;i<=nums.length;i++){
    ans=Math.max(ans,fn(nums,i));
}
return ans;
    }
    public int fn(int[]arr,int k){
        int p=1;
          int g = 0;
        int l = 1,ans=0;
        for(int i=0;i<k;i++){
            p*=arr[i];
            g=gcd(g,arr[i]);
            l=lcm(l,arr[i]);
        }
      if (p == g * l) ans = k;
        int si=0;
        for(int i=k;i<arr.length;i++){
            p*=arr[i];
            p/=arr[si];
            g = 0;
            l = 1;

            for (int j = si + 1; j <= i; j++) {
                g = gcd(g, arr[j]);
                l = lcm(l, arr[j]);
            }

            if (p == g * l) ans = Math.max(ans,k);
            si++;
            
        }
        return ans;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
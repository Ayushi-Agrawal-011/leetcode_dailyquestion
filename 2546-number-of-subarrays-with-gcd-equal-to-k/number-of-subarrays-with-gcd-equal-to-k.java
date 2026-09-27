class Solution {
    public int subarrayGCD(int[] nums, int k) {
        if(nums.length==1 ){
            if(nums[0]==k)
            return 1;
            return 0;
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            int gcd=nums[i];
for(int j=i;j<nums.length;j++){
gcd=fn(gcd,nums[j]);
if(gcd==k)
c++;
}
        }
        return c;
    }
  public  int fn(int a, int b) {
    while(b != 0) {
        int temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}
}
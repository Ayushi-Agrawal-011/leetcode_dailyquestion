class Solution {
    int sum=0;
    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums);
        long mod = 1_000_000_007;
        long sum = 0;
        int n=nums.length;
   long[] pow = new long[n];
pow[0] = 1;
for (int i = 1; i < n; i++) {
    pow[i] = (pow[i - 1] * 2) % mod;
}
       
        for(int i=0;i<n;i++){
       sum = (sum + nums[i] * (pow[i] - pow[n - i - 1])) % mod;

          
        }
         return (int)((sum + mod) % mod);
   
    }
}
class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length];
   dp[0]=nums[0];
   if(nums.length==1)
   return dp[0];
   dp[1]=Math.max(nums[0],nums[1]);
   for(int i=2;i<dp.length;i++){
    int rob=dp[i-2]+nums[i];
    int drob=dp[i-1];
    dp[i]=Math.max(rob,drob);
   }
      return dp[nums.length-1];
     
     
    }
  
}
class Solution {
    public int maxProduct(int[] nums) {
    int[]dp=new int[nums.length];
        if(nums.length<2)
        return nums[0];
        dp[0]=nums[0];
      int mini=nums[0];
      int  ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prevmax=dp[i-1];
            dp[i]=Math.max(curr,Math.max(curr*prevmax,curr*mini));
            mini=Math.min(curr,Math.min(curr*prevmax,curr*mini));
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}
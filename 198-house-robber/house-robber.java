class Solution {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,-1);
     return fn(nums,0,dp) ;  
    }
    public int fn(int[]nums,int i,int[]dp){
        if(i>=nums.length)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int a=nums[i]+fn(nums,i+2,dp);
        int b=fn(nums,i+1,dp);
        return dp[i]=Math.max(a,b);
    }
}
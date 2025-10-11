class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length];
        Arrays.fill(dp,-1);
       return  r(nums,0,dp);
    }
    public static int r(int [] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1)
        return dp[i];
        int left=nums[i]+ r(nums,i+2,dp);
        int right=r(nums,i+1,dp);
        return dp[i]= Math.max(left,right);

    }
}
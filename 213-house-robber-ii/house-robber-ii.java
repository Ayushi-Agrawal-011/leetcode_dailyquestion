
class Solution {
    public int rob(int[] nums) {
         int [] dp=new int[nums.length];
             Arrays.fill(dp,-1);
        int n=nums.length;
          if (n == 0) return 0;          // No houses
        if (n == 1) return nums[0];
        int a=r(nums, 0,n-2,dp);
         int [] dp1=new int[nums.length];
             Arrays.fill(dp1,-1);
        int b=r(nums,1,n-1,dp1);
        return Math.max(a,b);
    }

    private int r(int[] nums, int i,int j,int[]dp) {
        if (i >j) return 0; // correct base case
if(dp[i]!=-1)
return dp[i];
        int rob = nums[i] + r(nums, i + 2,j,dp);
        int skip = r(nums, i + 1,j,dp);

        return dp[i]=Math.max(rob, skip);
    }}
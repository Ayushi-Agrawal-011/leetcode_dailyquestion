class Solution {
    public int minCostClimbingStairs(int[] cost) {
      int []dp=new int[cost.length];
      Arrays.fill(dp,-1);
      int a=helper(cost,0,dp);
     
      int b=helper(cost,1,dp);
      return Math.min(a,b);
      
         
    }
    public int helper(int []cost,int idx,int[]dp){
    if(idx>=cost.length){
        return 0;
    }
    if(dp[idx]!=-1)
    return dp[idx];
        int left=cost[idx]+helper(cost,idx+1,dp);
        int right=cost[idx]+helper(cost,idx+2,dp);
        return dp[idx]=Math.min(left,right);
    }
}
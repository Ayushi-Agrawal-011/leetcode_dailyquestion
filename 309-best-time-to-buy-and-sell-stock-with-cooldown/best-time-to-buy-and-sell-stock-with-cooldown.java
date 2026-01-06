class Solution {
    public int maxProfit(int[] prices) {
        int[][]dp=new int[prices.length][2];
  for(int[]ar:dp){
    Arrays.fill(ar,-1);
  }
        return fn(prices,0,1,dp);
    }
    public int fn(int[]prices,int i,int buy,int[][] dp){
        if(i>=prices.length)
        return 0;
        if(dp[i][buy]!=-1)
        return dp[i][buy];
     if(buy==1){
        dp[i][buy]=Math.max(-prices[i]+fn(prices,i+1,0,dp),fn(prices,i+1,1,dp));
     }
    else {
            dp[i][buy] = Math.max(
                prices[i]+fn(prices,i+2,1,dp),             
                fn(prices, i + 1, 0, dp) 
            );
        }
     return dp[i][buy];
    }
}
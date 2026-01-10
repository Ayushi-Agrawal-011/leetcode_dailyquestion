class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int[][]dp=new int[prices.length][2];
  for(int[]ar:dp){
    Arrays.fill(ar,-1);
  }
        return fn(prices,0,1,dp,fee);
    }
    public int fn(int[]prices,int i,int buy,int[][] dp,int fee){
        if(i>=prices.length)
        return 0;
        if(dp[i][buy]!=-1)
        return dp[i][buy];
     if(buy==1){
        dp[i][buy]=Math.max(-prices[i]+fn(prices,i+1,0,dp,fee),fn(prices,i+1,1,dp,fee));
     }
    else {
            dp[i][buy] = Math.max(
                prices[i]-fee+fn(prices,i+1,1,dp,fee),             
                fn(prices, i + 1, 0, dp,fee) 
            );
        }
     return dp[i][buy];
    }
}
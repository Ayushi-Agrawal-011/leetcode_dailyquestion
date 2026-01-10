class Solution {
    public int maxProfit(int[] prices) {
        
       int[][][]dp=new int[prices.length][2][3];
for (int i = 0; i <prices.length; i++)
            for (int j = 0; j < 2; j++)
                Arrays.fill(dp[i][j], -1);
        return fn(prices,0,1,dp,2);
    }
    public int fn(int[]prices,int i,int buy,int[][][] dp,int limit){
        if(i>=prices.length || limit<=0)
        return 0;
        if (dp[i][buy][limit] != -1) return dp[i][buy][limit];

     if(buy==1){
   return   dp[i][buy][limit]= Math.max(-prices[i]+fn(prices,i+1,0,dp,limit),fn(prices,i+1,1,dp,limit));
     }
    else {
        return   dp[i][buy][limit]= Math.max(
                prices[i]+fn(prices,i+1,1,dp,limit-1),             
                fn(prices, i + 1, 0, dp,limit) 
            );
        
   }
}
}
class Solution {

    public int coinChange(int[] coins, int amount) {
	int[][] dp = new int[amount + 1][coins.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
          int ans = c2(coins, amount, 0, dp);
     return ans >= 1e9 ? -1 : ans;

    }
    public int c2(int[]coins,int amount,int i,int [][]dp){
        if(amount==0)
        return 0;
        if(i==coins.length)
        return (int)1e9;
        if(dp[amount][i]!=-1)
        return dp[amount][i];
        int pick=(int)1e9,dopick=0;
        if(amount>=coins[i])
         pick=1+c2(coins,amount-coins[i],i,dp);
         dopick=c2(coins,amount,i+1,dp);
        return dp[amount][i]=Math.min(pick,dopick);
    }

    
	
}
class Solution {

    public int change( int amount,int[] coins) {
	int[][] dp = new int[amount + 1][coins.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
       return c2(coins,amount,0,dp);
    }
    public int c2(int[]coins,int amount,int i,int [][]dp){
        if(amount==0)
        return 1;
        if(i==coins.length)
        return 0;
        if(dp[amount][i]!=-1)
        return dp[amount][i];
        int pick=0,dopick=0;
        if(amount>=coins[i])
         pick=c2(coins,amount-coins[i],i,dp);
         dopick=c2(coins,amount,i+1,dp);
        return dp[amount][i]=pick+dopick;
    }

    
	
}
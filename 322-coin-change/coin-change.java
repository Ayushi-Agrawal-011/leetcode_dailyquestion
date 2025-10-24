class Solution {

    public int coinChange(int[] coins, int amount) {
	int[][] dp = new int[amount + 1][coins.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
        int ans = Coin_Change(coins, amount, 0, dp);
		  return ans == Integer.MAX_VALUE ? -1 : ans; 
    }
    public static int Coin_Change(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 0;
		}
		if (i == coin.length) {
			return Integer.MAX_VALUE ;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}
		int inc = Integer.MAX_VALUE, exc = Integer.MAX_VALUE;
		if (amount >= coin[i]) {
			inc = Coin_Change(coin, amount - coin[i], i, dp);
            if(inc !=Integer.MAX_VALUE)
            inc+=1;
		}
		exc = Coin_Change(coin, amount, i + 1, dp);
	
		return dp[amount][i] =Math.min(inc,exc);

	}
}
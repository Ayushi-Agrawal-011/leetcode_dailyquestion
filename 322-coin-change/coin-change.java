class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][]dp=new int[amount+1][coins.length];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
    int ans= fn(coins,0,amount,dp);
    return ans>=Integer.MAX_VALUE?-1:ans;
    }
    public int fn(int[]coins,int i,int amount,int[][]dp){
        if(amount==0)
        return 0;
        if(i>=coins.length)
        return Integer.MAX_VALUE;
        if(dp[amount][i]!=-1)
        return dp[amount][i];
        int inc=Integer.MAX_VALUE,exc=0;
        if(amount>=coins[i]){
            int res=fn(coins,i,amount-coins[i],dp);
            if(res!=Integer.MAX_VALUE)
            inc=1+res;
            
        }
       exc= fn(coins,i+1,amount,dp); 
      return dp[amount][i]=Math.min(inc,exc);

    }
}
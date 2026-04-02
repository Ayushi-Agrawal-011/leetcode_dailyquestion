class Solution {
    public int maximumAmount(int[][] coins) {
        int[][][]dp=new int[coins.length][coins[0].length][3];
        for(int[][]arr:dp){
            for(int[]ar:arr){
                Arrays.fill(ar,Integer.MIN_VALUE);
            }
        }
    return fn(coins,0,0,0,dp);
    }
    public int fn(int[][]coins,int i,int j,int k,int[][][]dp){
        if(i>=coins.length || j>=coins[0].length)
        return Integer.MIN_VALUE;
        if(i==coins.length-1 && j==coins[0].length-1){
            if(k<2){
                 return Math.max(coins[i][j], 0);
            }
            return coins[i][j];
        }
        if(dp[i][j][k]!=Integer.MIN_VALUE)
        return dp[i][j][k];
        int right=fn(coins,i,j+1,k,dp);
        int down=fn(coins,i+1,j,k,dp);
       
        int take = Integer.MIN_VALUE;
        int bestNext = Math.max(right, down);
        if (bestNext != Integer.MIN_VALUE) {
            take = coins[i][j] + bestNext;
        }
        
        int skip=Integer.MIN_VALUE;
        if(k<2){
            skip=Math.max(fn(coins,i,j+1,k+1,dp),fn(coins,i+1,j,k+1,dp));
            }
            return dp[i][j][k]=Math.max(take,skip);
        
    }
}
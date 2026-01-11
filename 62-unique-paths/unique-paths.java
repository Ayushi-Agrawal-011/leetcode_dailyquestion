class Solution {
    public int uniquePaths(int m, int n) {
      int[][]dp=new int[m][n];
      for(int[]ar:dp){
        Arrays.fill(ar,-1);
      }
      return solve(dp,n,m,0,0);
    }
 
    public int solve(int [][] dp,int n,int m,int i,int j){
        if(i<0 || j<0 || i>=m || j>=n)
        return 0;
        if(i==m-1 && j==n-1)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int right=solve(dp,n,m,i,j+1);
        int down=solve(dp,n,m,i+1,j);
        return dp[i][j]=right+down;
    }
}
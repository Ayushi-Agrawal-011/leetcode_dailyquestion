class Solution {
    public int minPathSum(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length; 
       int[][] dp = new int[n][m];
        for(int[] num : dp)
            Arrays.fill(num, -1);
    return solve(grid,dp,n,m,0,0);
    }
    public int solve(int [][]grid,int [][] dp,int n,int m,int i,int j){
          if( i<0 || j<0 ||i>=n || j>=m)
        return Integer.MAX_VALUE;
        if(i==n-1 && j==m-1)
        return grid[i][j];
      
        if(dp[i][j]!=-1)
        return dp[i][j];
        int a=solve(grid,dp,n,m,i+1,j);
        int b=solve(grid,dp,n,m,i,j+1);
        return dp[i][j]=Math.min(a,b)+grid[i][j];
      
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       int ans=Integer.MAX_VALUE;
       int[][]dp=new int[m][n];
       for(int[]ar:dp){
        Arrays.fill(ar,-1);
       }
     return  fn(grid,0,0,grid.length,grid[0].length,dp);
    }
    public int fn(int[][]grid,int i,int j,int m,int n,int [][] dp){
        if(i<0 || j<0 || i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
        int down=fn(grid,i+1,j,m,n,dp);
        int right=fn(grid,i,j+1,m,n,dp);
        return dp[i][j]=Math.min(down,right)+grid[i][j];

    }
}
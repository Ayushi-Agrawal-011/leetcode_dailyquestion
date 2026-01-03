class Solution {
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
      for(int[]ar:dp){
        Arrays.fill(ar,-1);
      }
     return   fn(grid,0,0,dp);
    }
    public int fn(int[][]grid,int i,int j,int[][]dp){
        if(i<0 || j<0 || i>=grid.length|| j>=grid[0].length)
        return Integer.MAX_VALUE;
        if(i==grid.length-1 && j==grid[0].length-1)
        return grid[i][j];
        if(dp[i][j]!=-1)
        return dp[i][j];
        int right=fn(grid,i,j+1,dp);
        int down=fn(grid,i+1,j,dp);
        return dp[i][j]=Math.min(right,down)+grid[i][j];

    }
}
class Solution {
    public int minPathSum(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length; 
       int[][] memo = new int[n+1][m+1];
        for(int[] num : memo)
            Arrays.fill(num, -1);
       return solve(grid,memo,n,m,0,0);
    }
    public int solve(int [][]grid,int [][] memo,int n,int m,int i,int j){
        if(i>=n || j>=m)
        return Integer.MAX_VALUE;
        if(i==n-1 && j==m-1)
          return grid[i][j];
          if(memo[i][j]!=-1)
          return memo[i][j];
          return memo[i][j]=grid[i][j]+Math.min(solve(grid,memo,n,m,i,j+1),solve(grid,memo,n,m,i+1,j));
    }
}
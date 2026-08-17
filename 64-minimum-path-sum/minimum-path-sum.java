class Solution {
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length+1][grid[0].length+1];
for(int[]ar:dp)
        Arrays.fill(ar,-1);
        return fn(grid,0,0,dp);

    }
    public int fn(int[][]grid,int i,int j,int[][]dp){
        if(i==grid.length-1 && j==grid[0].length-1)
        return grid[i][j];
            if(i==grid.length || j==grid[0].length )
            return Integer.MAX_VALUE;
            if(dp[i][j]!=-1)
            return dp[i][j];
            int a=fn(grid,i,j+1,dp);
            int b=fn(grid,i+1,j,dp);
            return dp[i][j]= Math.min(a,b)+grid[i][j];
        
    }
}
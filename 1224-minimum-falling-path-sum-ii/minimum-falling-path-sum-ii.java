class Solution {
    public int minFallingPathSum(int[][] grid) {  
    int[][]dp=new int[grid.length][grid[0].length];
        for(int[]ar:dp)
        Arrays.fill(ar,-66666);
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<grid[0].length;j++){
            ans=Math.min(ans,fn(grid,0,j,dp));
        }
        return ans;
    }
    public int fn(int[][]grid,int i,int j,int[][]dp){
            if (i >= grid.length || j >= grid[0].length || i<0 || j<0)
            return Integer.MAX_VALUE;
        if (i == grid.length - 1 )
            return grid[i][j];
        if(dp[i][j]!=-66666)
        return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=0;k<grid[0].length;k++){
            if(k==j)
continue;
    ans=Math.min(ans,fn(grid,i+1,k,dp));
        }
        return dp[i][j]=ans+grid[i][j];
    }
}
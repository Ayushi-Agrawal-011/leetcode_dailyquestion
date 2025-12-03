class Solution {
    public int minFallingPathSum(int[][] grid) {
  int ans=Integer.MAX_VALUE;
  int n=grid.length;
  int[][]dp=new int[n][n];
  for(int[]ar:dp){
    Arrays.fill(ar,-66666);
  }
  for(int i=0;i<grid[0].length;i++){
    ans=Math.min(ans,fn(grid,0,i,n,n,dp));
  }
return ans;
    }
   
    public int fn(int[][]grid,int i,int j,int m,int n,int [][] dp){
        if(i<0 || j<0 || i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-66666)
        return dp[i][j];
        int down=fn(grid,i+1,j,m,n,dp);
        int ld=fn(grid,i+1,j-1,m,n,dp);
         int rd=fn(grid,i+1,j+1,m,n,dp);
        return dp[i][j]=Math.min(down,Math.min(ld,rd))+grid[i][j];

    }
}
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
        if(i==m-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-66666)
        return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=0;k<n;k++){
            if(k==j)
            continue;
             int ld=fn(grid,i+1,k,m,n,dp);
   ans=Math.min(ans,ld);
         
       
        }

return dp[i][j]=ans+grid[i][j];
    }
}
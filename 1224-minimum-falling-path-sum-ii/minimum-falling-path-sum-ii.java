class Solution {
    public int minFallingPathSum(int[][] grid) {
   int ans=Integer.MAX_VALUE;
  int n=grid.length;
  int[][]dp=new int[n][n];
  for(int[]ar:dp){
    Arrays.fill(ar,-66666);
  }
  for(int i=0;i<grid[0].length;i++){
    ans=Math.min(ans,fn(grid,dp,n,n,0,i));
  }
return ans;
    }
 
  public int fn(int [][]grid,int [][] dp,int n,int m,int i,int j){
       if(i<0 ||j<0 || i>=n || j>=m)
       return   Integer.MAX_VALUE;
    if (i == n - 1)
            return grid[i][j];
       if(dp[i][j]!=-66666)
       return dp[i][j];
int ans=Integer.MAX_VALUE;
      for(int p=0;p<m;p++ ){
        if(p==j){
            continue;
        }
        ans=Math.min(ans,fn(grid,dp,n,m,i+1,p));
      }
      
           return dp[i][j]=ans+grid[i][j];

      
    }
}
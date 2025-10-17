class Solution {
    public int minFallingPathSum(int[][] matrix) {
    int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp = new int[n][m];
		for(int[]a:dp)
			Arrays.fill(a, -66666);
		int ans=Integer.MAX_VALUE;
		for(int col=0;col<matrix[0].length;col++) {
			ans=Math.min(ans,solve(matrix,dp,n,m,0,col));
		}
		return ans;
    }
 
    public int solve(int [][]grid,int [][] dp,int n,int m,int i,int j){
          if( i<0 || j<0 ||i>=n || j>=m)
        return Integer.MAX_VALUE;
        if(i==n-1)
        return grid[i][j];
      
        if(dp[i][j]!=-66666)
        return dp[i][j];
int ans=Integer.MAX_VALUE;
      for(int k=0;k<m;k++){
      if(k==j)
      continue;
      ans=Math.min(ans,solve(grid,dp,n,m,i+1,k));
      }

        return dp[i][j]=ans+grid[i][j];
      
    }
}
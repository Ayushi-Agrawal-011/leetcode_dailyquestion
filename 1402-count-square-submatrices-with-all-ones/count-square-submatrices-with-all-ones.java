class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][]dp=new int[n][m];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c+=fn(matrix,dp,i,j);
            }
        }
        return c;
       
    }
    public int fn(int[][]matrix,int[][]dp,int i,int j){
      if(i>=matrix.length || j>=matrix[0].length)
      return 0;
      if(matrix[i][j]==0)
      return 0;
      if(dp[i][j]!=-1)
      return dp[i][j];
      int right=fn(matrix,dp,i,j+1);
      int bottom=fn(matrix,dp,i+1,j);
      int diagonal=fn(matrix,dp,i+1,j+1);
      return dp[i][j]=Math.min(right,Math.min(bottom,diagonal))+1;
    }
}
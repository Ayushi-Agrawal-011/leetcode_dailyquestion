class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int r=0;
        int[][]dp=new int[n][m];
         
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                r=Math.max(r,fn(matrix,dp,i,j));
            }
        }
        return r;
    }
     public int fn(int[][]matrix,int[][]dp,int i,int j){
     if(dp[i][j]!=0)
     return dp[i][j];
      int max = 1;
     if(i>0 && matrix[i-1][j] >matrix[i][j])
  max= Math.max(max,1+fn(matrix,dp,i-1,j));
      if(j>0 && matrix[i][j-1] >matrix[i][j])
     max= Math.max(max, 1+fn(matrix,dp,i,j-1));
       if(i<matrix.length-1 && matrix[i+1][j] >matrix[i][j])
  max= Math.max(max,1+fn(matrix,dp,i+1,j));
  if(j<matrix[0].length-1 && matrix[i][j+1] >matrix[i][j])
     max= Math.max(max, 1+fn(matrix,dp,i,j+1));
    return dp[i][j]=max;
    }


}
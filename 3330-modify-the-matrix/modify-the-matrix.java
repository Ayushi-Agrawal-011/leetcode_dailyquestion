class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
         
         int m=matrix.length-1,n=matrix[0].length-1;
         int []ans=new int[n+1];
         int a=0;
     for(int i=0;i<=n ;i++){
        int p=0;
        for(int j=0;j<=m ;j++){
        p=Math.max(p,matrix[j][i]);
        }
        ans[a]=p;
        a++;
     }
       for(int i=0;i<=m ;i++){
  
        for(int j=0;j<=n ;j++){
       if(matrix[i][j]==-1)
       matrix[i][j]=ans[j];
        }
       
     }

     return matrix;   
    } 
    
}
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowcnt=new HashSet<>();
        Set<Integer> colcnt=new HashSet<>();

        
             for(int i=0;i<matrix.length;i++){
            for( int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==0)
              {
                rowcnt.add(i);
                colcnt.add(j);
              }
            }}
            for(int row:rowcnt){
                rowzero(matrix,row);
            }
             for(int col:colcnt){
                colzero(matrix,col);
            }
    }
    public static void rowzero(int [][]arr,int row){
        for(int col=0;col<arr[0].length;col++){
            arr[row][col]=0;
        }
    }
       public static void colzero(int [][]arr,int col){
        for(int row=0;row<arr.length;row++){
            arr[row][col]=0;
        }
    }       
     
}
class Solution {
    public int numEnclaves(int[][] board) {
          int m = board.length, n = board[0].length;

        // Step 1: Mark border-connected 'O's
        for(int i = 0; i < m; i++) {
            if(board[i][0] == 1) fn(board, i, 0);
            if(board[i][n-1] == 1) fn(board, i, n-1);
        }
        for(int j = 0; j < n; j++) {
            if(board[0][j] == 1) fn(board, 0, j);
            if(board[m-1][j] == 1) fn(board, m-1, j);
        }
int ans=0;
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]==1){
                ans++;;
            }
        
            }
        }
        return ans;
    }
      public void fn(int[][]board,int i,int j){
       if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j]!=1)
    return;

        board[i][j]=0;
        fn(board,i-1,j);
        fn(board,i+1,j);
        fn(board,i,j-1);
        fn(board,i,j+1);
    }
}
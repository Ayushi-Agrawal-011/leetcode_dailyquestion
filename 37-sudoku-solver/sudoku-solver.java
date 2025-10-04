class Solution {
    public void solveSudoku(char[][] board) {
        fill_Sudoku(board,0,0);
    }
    public boolean fill_Sudoku(char [][] board,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(board[row][col]!='.')
        return fill_Sudoku(board,row,col+1);
          for (char num = '1'; num <= '9'; num++) {
            if (isitsafe(board, row, col, num)) {
                board[row][col] = num;
                if (fill_Sudoku(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
return false;

    }
    public boolean isitsafe(char [][]ar,int i,int j,int val){
       
        //checking for row
        for(int k=0;k<ar[0].length;k++){
            if(ar[i][k]==val)
            return false;
        }
           //checking for col
       for(int k=0;k<ar.length;k++){
            if(ar[k][j]==val)
            return false;
        }
        //for 3*3 matrix
        int r=i-i%3;
        int c=j-j%3;
        for(int a=r;a<r+3;a++){
            for(int b=c;b<c+3;b++){
                if(ar[a][b]==val)
                return false;
            }
        }
        return true;

    }
}
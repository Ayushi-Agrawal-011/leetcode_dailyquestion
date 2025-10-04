class Solution {
    public boolean exist(char[][] board, String word) {
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]==word.charAt(0)){
               boolean ans=Search(board,i,j,0,word);
                if(ans)
                return true;
            }
        }
      }
      return false;
    }
    public static boolean Search(char [][]board,int cr,int cc,int idx,String word){
        if(idx==word.length()){
            return true;
        }
        if(cr<0 || cc<0 || cr>=board.length ||cc>=board[0].length || word.charAt(idx)!=board[cr][cc]  ){
            return false;
        }
        int []row={-1,0,1,0};
        int []col={0,-1,0,1};
        board[cr][cc]='*';
        for(int i=0;i<row.length;i++){
          boolean ans=  Search(board,cr+row[i],cc+col[i],idx+1,word);
          if(ans)
          return true;
        }
     
            board[cr][cc]=word.charAt(idx);
        return false;
    }
   
    
 
}
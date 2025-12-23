class Solution {
    static  List<List<String>> ans;
    public int totalNQueens(int n) {
         List<List<String>> p=new ArrayList<>();
       char [][] arr=new char[n][n];
    ans=new ArrayList<>();
   for(char []ar:arr){
    Arrays.fill(ar,'.');
   }
    int l=fn(arr,0,n,n,p,new ArrayList<>());  
    return l;   
    }
public static  int fn(char[][]board,int row,int n,int tq,List<List<String>> p,List<String> ll){
    int c=0;
        if(tq==0){
           p.add(con(board));
            return 1;
        }
        for(int col=0;col<n;col++){
            if(isitsafe(board,row,col)){
                board[row][col]='Q';
              c+=  fn(board,row+1,n,tq-1,p,ll);
                board[row][col]='.';

            }
        }
        return c;
    }
    public static boolean isitsafe(char[][]board,int row,int col){
          int i=row;
          int j=col;
          while(i>=0){
            if(board[i][j]=='Q')
            return false;
            i--;
          }
          i=row;
          j=col;
          while(i>=0 && j>=0){
            if(board[i][j]=='Q')
            return false;
            i--;
            j--;
          }
            i=row;
          j=col;
          while(i>=0 && j<board[0].length){
            if(board[i][j]=='Q')
            return false;
            i--;
            j++;
          }
          return true;

    }
     public static List<String> con(char [][]board){
        List<String> w=new ArrayList<>();
         for (int i=0;i<board.length;i++) {
            w.add(new String(board[i]));
        }
        return w;
    }
   
}
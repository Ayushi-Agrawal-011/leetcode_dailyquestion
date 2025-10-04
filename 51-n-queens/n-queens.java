class Solution {
   static  List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        String [][] arr=new String[n][n];
    ans=new ArrayList<>();
   for(String []ar:arr){
    Arrays.fill(ar,".");
   }
    fn(arr,0,n);  
    return ans;   
    }
    public void fn(String[][]board,int cr,int n){
        if(cr==n){
            List<String> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(board[i][j]);
            }
            ll.add(sb.toString());

        }
        ans.add(ll);
         return ;
        }
        for(int cc=0;cc<n;cc++){
           if(isitsafe(board,cr,cc)){
            board[cr][cc]="Q";
            fn(board,cr+1,n);
            board[cr][cc]=".";
           }
        }


    }
    public boolean isitsafe(String [][]board,int cr,int cc){
        //upr
        for(int i=cr;i>=0;i--){
            if(board[i][cc].equals("Q"))
            return false;
        }
        //left diagonal
        int row=cr;
        int col=cc;
       while(row>=0 && col>=0){
        if(board[row][col].equals("Q")){
            return false;
        }
        row--;
        col--;
       }
       row=cr;
       col=cc;
       while(row>=0 && col<board.length){
        if(board[row][col].equals("Q")){
            return false;
        }
        row--;
        col++;
       }
       return true;
    }
}
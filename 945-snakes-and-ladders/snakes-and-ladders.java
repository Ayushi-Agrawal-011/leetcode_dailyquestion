class Solution {

    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        Queue<int[]>q =new LinkedList<>();
        q.add(new int[]{1,0});
        boolean[] visited = new boolean[n * n + 1];
        while(!q.isEmpty()){
            int[]rp=q.poll();
            int square=rp[0];
            int moves=rp[1];
            for(int dice=1;dice<=6;dice++){
                int nextsquare=square+dice;
                if(nextsquare>n*n)
                continue;
                nextsquare=boardvalue(nextsquare,n,board);
                  if(nextsquare==n*n)
                return moves+1;
                if(!visited[nextsquare]){
                    visited[nextsquare]=true;
                    q.offer(new int[]{nextsquare,moves+1});
                }
            }
        }
        return -1;
    }
    public int  boardvalue(int square,int n,int[][]board){
        int row=(square-1)/n;
        int col= (square-1)%n;
        if(row%2==1){
            col=n-1-col;
        }
        
        int val = board[n - 1 - row][col];
        return val == -1 ? square : val;
    
    }
}
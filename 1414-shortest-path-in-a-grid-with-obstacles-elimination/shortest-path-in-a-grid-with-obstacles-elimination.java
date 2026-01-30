class Solution {
      int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int shortestPath(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
    
        Queue<Pair> q=new LinkedList<>();
         boolean[][][] visited = new boolean[m][n][m*n];
       

      q.add(new Pair(0,0,0,0));
        while(!q.isEmpty()){
            Pair rp=q.poll();
         
            if(rp.row==m-1 && rp.col==n-1)
            return rp.steps;
         
           for(int[]d:dir){
            int nr=rp.row+d[0];
            int nc=rp.col+d[1];
            
                if (nr < 0 || nc < 0 || nr >= m || nc >= n)
                    continue;
         int nk=rp.k+grid[nr][nc];
         if(k>=nk && !visited[nr][nc][nk]){
            visited[nr][nc][nk]=true;
            q.add(new Pair(nr,nc,rp.steps+1,nk));
         }
             

           }

        }
return -1;
    }
    class Pair{
        int row;
        int col;
        int steps;
        int k;
        public Pair(int row,int col,int steps,int k){
            this.row=row;
            this.col=col;
            this.steps=steps;
            this.k=k;
        }
    }
}
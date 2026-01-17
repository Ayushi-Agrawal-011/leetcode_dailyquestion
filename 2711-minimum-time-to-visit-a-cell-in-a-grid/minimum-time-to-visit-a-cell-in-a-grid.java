class Solution {
    public int minimumTime(int[][] grid) {
          if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }
          int m = grid.length;
          int  n = grid[0].length;
       PriorityQueue<Pair> pq=new  PriorityQueue<>((a,b)->(a.time-b.time));
       pq.add(new Pair(0,0,0));
       int[][]d={{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
   boolean[][] visited = new boolean[m][n];
       while(!pq.isEmpty()){
        Pair rp=pq.poll();
        if(rp.r==m-1 && rp.c==n-1){
            return rp.time;
        }
         if (visited[rp.r][rp.c]) {
                continue;
            }
            visited[rp.r][rp.c]=true;
        for(int[] nbrs:d){
            int nr=rp.r+nbrs[0];
            int nc=rp.c+nbrs[1];
             if (nr < 0 || nr == m || nc < 0 || nc == n || visited[nr][nc]) {
                    continue;
                }
                if(grid[nr][nc]<=rp.time+1){
                    pq.add(new Pair(nr,nc,rp.time+1));
                }
                else{
                    int diff=grid[nr][nc]-rp.time;
                    if(diff%2==1)
                    pq.add(new Pair(nr,nc,grid[nr][nc]));
                    else
                      pq.add(new Pair(nr,nc,grid[nr][nc]+1));
                }
        }
       
       }
        return -1;
    }
    class Pair{
        int r;
        int c;
        int time;
        public Pair(int r,int c,int time){
            this.r=r;
            this.c=c;
            this.time=time;
        }
    }
}
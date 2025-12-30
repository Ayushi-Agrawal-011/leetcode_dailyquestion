class Solution {
    int ans=Integer.MAX_VALUE;
    public int shortestPathBinaryMatrix(int[][] grid) {
       Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(0,0,0));
         int[][] d = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}, {1,1}, {-1,-1}, {1,-1}, {-1,1}};
         if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1)
         return -1;
         int n=grid.length;
         while(!q.isEmpty()){
            Pair rp=q.poll();
            if(rp.r==grid.length-1 && rp.c==grid[0].length-1)
            return rp.dist+1;
            for(int[]nbrs:d){
                int nr=rp.r+nbrs[0];
                int nc=rp.c+nbrs[1];
             
if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                    grid[nr][nc] = 1; // visited
                    q.add(new Pair(nr, nc, rp.dist + 1));
                }
            }
         }
         return -1;
    }
   class Pair{
    int r;
    int c;
    int dist;
    public Pair(int r,int c,int dist){
        this.r=r;
        this.c=c;
        this.dist=dist;
    }
   }
}
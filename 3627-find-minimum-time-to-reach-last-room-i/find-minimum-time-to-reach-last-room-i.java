class Solution {
    public int minTimeToReach(int[][] grid) {
         PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.cost-b.cost));
         pq.add(new Pair(0,0,0));
         int n=grid.length;
         int m=grid[0].length;
         int[][] dist=new int[n][m];
         int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] a:dist){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        dist[0][0]=0;
         while(!pq.isEmpty()){
     Pair rp=pq.poll();
     int x=rp.r;
     int y=rp.c;
     if(rp.cost>dist[x][y])
     continue;
     if(rp.r==n-1 && rp.c==m-1)
     return rp.cost;
     dist[x][y]=rp.cost;
     for(int[]d :dir){
        int nr=d[0]+x;
        int nc=d[1]+y;
        if(nr>=0 && nc>=0 && nr<n && nc<m){
            int ncost=Math.max(rp.cost,grid[nr][nc])+1;
             if(ncost < dist[nr][nc]){ 
                        dist[nr][nc] = ncost; 
                        pq.add(new Pair(nr, nc,ncost));
                    }
        }
     }
         }

return -1;
    }
    class Pair{
        int r;
        int c;
        int cost;
        public Pair(int r,int c,int cost){
            this.r=r;
            this.c=c;
            this.cost=cost;
        }
    }
}
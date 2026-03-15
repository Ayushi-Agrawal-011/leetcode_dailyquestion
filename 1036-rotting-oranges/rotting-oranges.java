class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
     PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.time-b.time));
     int c=0;
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2)
            pq.add(new Pair(i,j,0));
           else if(grid[i][j]==1)
            c++;
        }
     }
     if(c == 0) return 0; 
     int ans=0;
     int[][]dir={{-1,0},{1,0},{0,-1},{0,1}};
     while(!pq.isEmpty()){
        Pair rp=pq.poll();
        
        ans=Math.max(ans,rp.time);
        for(int []d:dir){
            int nr=d[0]+rp.r;
            int nc=d[1]+rp.c;
           if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1){
             grid[nr][nc]=2;
             c--;
             pq.add(new Pair(nr,nc,rp.time+1));
            }
        }
     }
      return c==0 ? ans : -1;
   
   
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
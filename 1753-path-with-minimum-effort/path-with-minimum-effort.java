class Solution {
    public int minimumEffortPath(int[][] heights) {
     int n=heights.length;
     int m=heights[0].length;
         int[] row={1,-1,0,0};
        int[] col={0,0,1,-1};
         int[][] dis=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dis[i],Integer.MAX_VALUE);
        }
         int ans=Integer.MAX_VALUE;
         PriorityQueue<Pair> pq =
    new PriorityQueue<>((a,b) -> a.diff - b.diff);
    pq.add(new Pair(0,0,0)) ;
    while(!pq.isEmpty()){
        Pair rp=pq.poll();
        if(rp.r==n-1 && rp.c==m-1)
        return rp.diff;
        for(int i=0;i<4;i++){
            int nr=rp.r+row[i];
            int nc=rp.c+col[i];
              if(nr<0 || nc<0 || nr>=n || nc>=m){
       continue;
            }
            int nd=Math.max(rp.diff,Math.abs(heights[nr][nc]-heights[rp.r][rp.c]));
            if(nd<dis[nr][nc]){
                dis[nr][nc]=nd;
                pq.add(new Pair(nr,nc,nd));
            }
        }
    }
     return dis[n-1][m-1];
    }
    class Pair{
        int r;
        int c;
        int diff;
        public Pair(int r,int c,int diff){
            this.r=r;
            this.c=c;
            this.diff=diff;
        }
    }
}
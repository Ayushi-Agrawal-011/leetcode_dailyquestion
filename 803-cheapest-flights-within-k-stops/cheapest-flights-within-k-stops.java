class Solution {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public int findCheapestPrice(int n, int[][] times, int src, int dst, int k) {
     map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        for(int i=0;i<times.length;i++){
            int a=times[i][0];
            int b=times[i][1];
            int w=times[i][2];
            map.get(a).put(b,w);
        }
           PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.cost-b.cost));
        pq.add(new Pair(src,0,0));
        int[][]dist=new int[k+2][n];
          for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[0][src] = 0;
        int ans=Integer.MAX_VALUE;
       
        while(!pq.isEmpty()){
            Pair rp=pq.poll();
  if(rp.vtx==dst){
          return rp.cost;
          }
            if(rp.stops>k)
            continue;
          
            
            for(int nbrs:map.get(rp.vtx).keySet()){
int nc=map.get(rp.vtx).get(nbrs)+rp.cost;
if( nc < dist[rp.stops+1][nbrs]){
        dist[rp.stops+1][nbrs] = nc;
        pq.add(new Pair(nbrs,nc,rp.stops+1));
    }
            }
        }

return -1;

    }
    class Pair{
        int vtx;
        int cost;
        int stops;
        public Pair(int vtx,int cost,int stops){
            this.vtx=vtx;
            this.cost=cost;
            this.stops=stops;
        }
    }
}
class Solution {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
          map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
     for(int i=0;i<n-1;i++){
        map.get(i).put(i+1,1);
     }
        int[]ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int u=queries[i][0];
            int v=queries[i][1];
          map.get(u).put(v,1);
        int[]arr= dijkstra(n,0);
        ans[i]=arr[n-1];
        }
        return ans;
    }
    public int[] dijkstra(int n,int src){
       PriorityQueue<Pair> pq=new    PriorityQueue<>((a,b)->(a.cost-b.cost));
       int[]dist=new int[n];
       Arrays.fill(dist,Integer.MAX_VALUE);
       dist[src]=0;
       pq.add(new Pair(src,0));
       while(!pq.isEmpty()){
        Pair rp=pq.poll();
        for(int nbrs:map.get(rp.vtx).keySet()){
            int c=map.get(rp.vtx).get(nbrs);
            if(dist[rp.vtx]+c<dist[nbrs]){
                dist[nbrs]=dist[rp.vtx]+c;
                pq.add(new Pair(nbrs,dist[nbrs]));
            }
        }
       }
       return dist;

    }
    class Pair{
        int vtx;
        int cost;
        public Pair(int vtx,int cost){
            this.vtx=vtx;
            this.cost=cost;
        }
    }
}
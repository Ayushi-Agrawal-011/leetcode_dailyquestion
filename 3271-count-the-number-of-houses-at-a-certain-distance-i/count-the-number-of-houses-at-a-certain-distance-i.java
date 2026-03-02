class Solution {
      private HashMap<Integer,HashMap<Integer,Integer>> map;
    public int[] countOfPairs(int n, int x, int y) {
       map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new HashMap<>());
        }
     for(int i=1;i<=n-1;i++){
        map.get(i).put(i+1,1);
           map.get(i+1).put(i,1);
     }
     int[]ans=new int[n];
    if (x != y) {
    map.get(x).put(y,1);
    map.get(y).put(x,1);
}
  
        for(int i=1;i<=n;i++){
int[]dist=dijkstra(n,i);
  for (int j = i + 1; j <= n; j++) {
                ans[dist[j] - 1]+=2;
            }

        }
        
        return ans;
    }
   public int[] dijkstra(int n,int src){
    
    PriorityQueue<Pair> pq =
        new PriorityQueue<>((a,b)->a.cost-b.cost);
    
    int[] dist = new int[n+1];
    Arrays.fill(dist,Integer.MAX_VALUE);
    
    dist[src]=0;
    pq.add(new Pair(src,0));
    
    while(!pq.isEmpty()){
        
        Pair rp=pq.poll();
        
        // 🔥 Important optimization
        if(rp.cost > dist[rp.vtx]) continue;
        
        for(int nbrs: map.get(rp.vtx).keySet()){
            
            int newCost = dist[rp.vtx] + 1;
            
            if(newCost < dist[nbrs]){
                dist[nbrs]=newCost;
                pq.add(new Pair(nbrs,newCost));
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
class Graph {
private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Graph(int n, int[][] edges) {
        map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        for(int i=0;i<edges.length;i++ ){
            int a=edges[i][0];
            int b=edges[i][1];
            int c=edges[i][2];
            map.get(a).put(b,c);
        }
    }
    
    public void addEdge(int[] edge) {
int a=edge[0];
            int b=edge[1];
            int c=edge[2];
            map.get(a).put(b,c);

    }
    
    public int shortestPath(int node1, int node2) {
       PriorityQueue<Pair> pq=new  PriorityQueue<>((a,b)->(a.dist-b.dist));
        pq.add(new Pair(node1,0));
         int[] dist = new int[map.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
         dist[node1] = 0;
        while(!pq.isEmpty()){
            Pair rp=pq.poll();
            if(rp.vtx==node2)
              return rp.dist;
                 if (rp.dist > dist[rp.vtx]) continue;
              for(int nbrs:map.get(rp.vtx).keySet()){
                int cost=map.get(rp.vtx).get(nbrs);
                if(rp.dist+cost<dist[nbrs]){
                    dist[nbrs] = rp.dist + cost;
                    pq.add(new Pair(nbrs, dist[nbrs]));
                }
              }
             
        }
         return -1;
    }
    class Pair{
        int vtx;
        int dist;
        public Pair(int vtx,int dist){
            this.vtx= vtx;
            this.dist=dist;
        }
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
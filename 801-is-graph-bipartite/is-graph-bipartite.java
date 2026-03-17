class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
            for(int j=0;j<graph[i].length;j++){
                map.get(i).add(graph[i][j]);
            }
        }
        Queue<Pair> q=new LinkedList<>();
HashMap<Integer,Integer> visited=new HashMap<>();
for(int src:map.keySet()){
    if(visited.containsKey(src))
    continue;
    q.add(new Pair(src,0));
    while(!q.isEmpty()){
        Pair rp=q.poll();
        if(visited.containsKey(rp.vtx)){
            if(visited.get(rp.vtx)!=rp.dist)
            return false;
            continue;
        }
        visited.put(rp.vtx,rp.dist);
        for(int nbrs:map.get(rp.vtx)){
            if(!visited.containsKey(nbrs)){
                q.add(new Pair(nbrs,rp.dist+1));
            }
        }
    }
}
        return true;
    }
    class Pair{
        int vtx;
        int dist;
        public Pair(int vtx,int dist){
            this.vtx=vtx;
            this.dist=dist;
        }
    }
}
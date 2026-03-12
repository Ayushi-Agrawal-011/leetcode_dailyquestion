class Solution {
    public boolean isBipartite(int[][] graph) {
     Queue<BipartitePair> q=new LinkedList<>();
     HashMap<Integer,Integer> visited=new HashMap<>();
    for(int i=0;i<graph.length;i++){
        if(visited.containsKey(i))
        continue;
        q.add(new BipartitePair(i,0));
        while(!q.isEmpty()){
            BipartitePair rp=q.poll();
            if(visited.containsKey(rp.vtx)){
                if(rp.dist!=visited.get(rp.vtx))
                return false;
                continue;
            }
            visited.put(rp.vtx,rp.dist);
            for(int nbrs:graph[rp.vtx]){
                if(!visited.containsKey(nbrs))
                q.add(new BipartitePair(nbrs,rp.dist+1));
            }
        }
    }
    return true;
    }
    class BipartitePair{
	
	int vtx;
	int dist;
	public BipartitePair(int vtx,int dist) {
		this.vtx=vtx;
		this.dist=dist;
	}
	
}
}
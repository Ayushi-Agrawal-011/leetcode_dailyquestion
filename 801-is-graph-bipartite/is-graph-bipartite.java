class Solution {
    class BipartitePair{
	
	int vtx;
	int dist;
	public BipartitePair(int vtx,int dist) {
		this.vtx=vtx;
		this.dist=dist;
	}
	
}
    public boolean isBipartite(int[][] graph) {
        
    
     int c=0;
			Queue<BipartitePair> q=new LinkedList<>();
			HashMap<Integer,Integer> visited=new HashMap<>();
			for(int i=0;i<graph.length;i++) {
			if(visited.containsKey(i)) {
				continue;
			}
			q.add(new BipartitePair(i,0));
			while(!q.isEmpty()) {
				//1-remove
			BipartitePair rp=q.poll();
				//2-ignore if aldready visited
			if(visited.containsKey(rp.vtx)) {
				if(visited.get(rp.vtx)!=rp.dist) {
					return false;
				}
				continue;
			}
				//3-marked visited
			visited.put(rp.vtx, rp.dist);
				//4-self work
				//5-addd unvisited
			for(int nbrs:graph[rp.vtx]) {
				if(!visited.containsKey(nbrs)) {
					q.add(new BipartitePair(nbrs,rp.dist+1));
				}
			}
				
			}
			
			}
			return true;
    }
}
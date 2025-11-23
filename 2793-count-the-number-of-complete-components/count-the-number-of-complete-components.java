class Solution {
       private HashMap<Integer, List<Integer>> mp;
    public int countCompleteComponents(int n, int[][] edges) {
          Solution ts=new Solution(n);
          
for(int i=0;i<edges.length;i++){
ts.AddEdge(edges[i][0],edges[i][1]);
}
return ts.DFT();
    }
    public Solution() {}
     public Solution(int v){
	        mp=new HashMap<>();
	        for (int i=0;i<v;i++){
	            mp.put(i,new ArrayList<>());
	        }

	    }
	   
	    public void AddEdge(int v1,int v2){
	        mp.get(v1).add(v2);
  mp.get(v2).add(v1);
	    }
        public int DFT() {
		Stack<Integer> st=new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		int c=0;
	for(int src:mp.keySet()) {
		if(visited.contains(src))
			continue;
		
        int nodes=0,edges=0;
		st.push(src);
		while(!st.isEmpty()) {
			//1-remove
			int r=st.pop();
			//2-ignore
			if(visited.contains(r))
				continue;
			//3-marked visited
            nodes++;
			visited.add(r);
			//4-self work
			  edges += mp.get(r).size();
			//5-add unvisited
			for(int nbrs:mp.get(r)) {
				if(!visited.contains(nbrs))
					st.push(nbrs);
			}
			
		}
        edges/=2; 
        int redges=(nodes)*(nodes-1)/2;
        if(redges==edges)
        c++;
        }
return c;
		
	}
}
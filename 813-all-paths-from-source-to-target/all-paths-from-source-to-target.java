class Solution {
      private HashMap<Integer, List<Integer>> mp;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Solution ts=new Solution(graph.length);
          
for (int i = 0; i < graph.length; i++) {
            for (int nxt : graph[i]) {
                ts.AddEdge(i, nxt);
            }
        }
List<List<Integer>> k=new ArrayList<>(); 
ts.PrintPath(0,graph.length-1,new HashSet<>(),k,new ArrayList<>());
return k;  
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

	    }
        public void PrintPath(int src,int des,HashSet<Integer> visited,List<List<Integer>> k,List<Integer> p) {
            p.add(src);
	if(src==des) {
		 k.add(new ArrayList<>(p));  // store copy
            p.remove(p.size() - 1);     // backtrack
            return; 
	}
	visited.add(src);
	for(int x:mp.get(src)) {
		if(!visited.contains(x)) {
			PrintPath(x,des,visited,k,p);
		    
		}
		 
	}
	visited.remove(src);
    p.remove(p.size()-1);
	
}
}
class Solution {

     private HashMap<Integer, List<Integer>> mp;
    public boolean validPath(int n, int[][] edges, int src, int des) {
         Solution ts=new Solution(n);
          
for(int i=0;i<edges.length;i++){
ts.AddEdge(edges[i][0],edges[i][1]);
}
return ts.HasPath(src,des,new HashSet<>());
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
	  public boolean HasPath(int src,int des,HashSet<Integer> visited) {
	if(src==des) {
		return true;
	}
	visited.add(src);
	for(int x:mp.get(src)) {
		if(!visited.contains(x)) {
			boolean ans=HasPath(x,des,visited);
			if(ans)
				return ans;
		}
	}
	return false;
}
}
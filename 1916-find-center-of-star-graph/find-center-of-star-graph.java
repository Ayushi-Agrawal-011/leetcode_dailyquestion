class Solution {
     private HashMap<Integer, List<Integer>> mp;
    public int findCenter(int[][] edges) {
          Solution ts=new Solution(edges.length+2);
          
for (int i = 0; i <edges.length; i++) {
     ts.AddEdge(edges[i][0], edges[i][1]);
          
    }
    return ts.isCycle();
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
	    public int [] indegree(){
	        int [] in=new int[mp.size()];
	        for (int v1:mp.keySet()){
	            for (int v2:mp.get(v1)){
	                in[v2]++;
	            }
	        }
	        return in;
	    }
	    public int isCycle(){
	       
	        int[] in=indegree();
            for(int i=0;i<in.length;i++){
                if(in[i]==in.length-2)
                return i;
            }
            return 0;
	       
	    }
}
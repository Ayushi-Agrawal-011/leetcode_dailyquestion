class Solution {
      private HashMap<Integer, List<Integer>> mp;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
   Solution ts=new Solution(numCourses);
          
for(int i=0;i<prerequisites.length;i++){
ts.AddEdge(prerequisites[i][1],prerequisites[i][0]);
}
int[]k=  ts.isCyle(); 
return k;   }  
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
	    public int [] indegree(){
	        int [] in=new int[mp.size()];
	        for (int v1:mp.keySet()){
	            for (int v2:mp.get(v1)){
	                in[v2]++;
	            }
	        }
	        return in;
	    }
	    public int[] isCyle(){
	        Queue<Integer> q=new LinkedList<>();
	        int[] in=indegree();
	        for (int i=0;i<in.length;i++){
	            if(in[i]==0){
	                q.add(i);
	            }
	        }
            int[]ans=new int[mp.size()];
	        int c=0,i=0;
	        while(!q.isEmpty()){
	            int r=q.poll();
	            c++;
                ans[i]=r;
                i++;
       //System.out.println(r+" ");
	            for (int nbrs:mp.get(r)){
	                in[nbrs]--;
	                if(in[nbrs]==0){
	                    q.add(nbrs);
	                }
	            }
	        }
            if(c==mp.size())
	        return ans;
            return new int[0];
	    }}
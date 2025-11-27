class Solution {
      private HashMap<Integer, List<Integer>> map;
     private List<List<Integer>> res;
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
      Solution ts=new Solution(n);
     //res=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            ts.Addedge(edges[i][0],edges[i][1]);
        }   
        ts.Topological();
        return ts.res;

    }
      public Solution(){

    }
    public Solution(int n){
          map = new HashMap<>();
          res=new ArrayList<>();
		for (int i = 0; i <n; i++) {
			map.put(i, new ArrayList<>());
         res.add(new ArrayList<>());
		}
    }
    public void Addedge(int v1, int v2) {
		map.get(v1).add(v2);

	}
public int[] indegree() {
		int[] in = new int[map.size()];
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1)) {
				in[v2]++;
			}
		}
		return in;
	}

	public void Topological() {
		Queue<Integer> q = new LinkedList<>();
		int[] in = indegree();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int r = q.poll();
			//System.out.print(r + " ");
			for(int nbrs:map.get(r)) {
				in[nbrs]--;
                res.get(nbrs).add(r);
            if(res.get(r).size()!=0){
                for(int k:res.get(r)){
                    if(!res.get(nbrs).contains(k))
                     res.get(nbrs).add(k);
                }
               
            }
             Collections.sort(res.get(nbrs));
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}

		}
		System.out.println();

	}
}
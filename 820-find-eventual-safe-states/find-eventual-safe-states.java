class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       int n=graph.length;
       List<List<Integer>> alist=new ArrayList<>();
       for(int i=0;i<n;i++){
        alist.add(new ArrayList<>());
       }
       int[]indegree=new int[n];
       for(int i=0;i<n;i++){
        for(int nbrs:graph[i]){
           alist.get(nbrs).add(i);
           indegree[i]++;
        }
       }
       List<Integer> safenodes=new ArrayList<>();
       Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < indegree.length; i++) {
			if (indegree[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int r = q.poll();
		safenodes.add(r);
			for(int nbrs:alist.get(r)) {
				indegree[nbrs]--;
				if(indegree[nbrs]==0) {
					q.add(nbrs);
				}
			}

		}
         Collections.sort(safenodes);
        return safenodes;
    }
}
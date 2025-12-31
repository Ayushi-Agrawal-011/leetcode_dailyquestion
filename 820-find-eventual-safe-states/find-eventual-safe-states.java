class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       int n=graph.length;
       List<List<Integer>> alist=new ArrayList<>();
       for(int i=0;i<n;i++){
        alist.add(new ArrayList<>());
       }
       int[]outdegree=new int[n];
       for(int i=0;i<n;i++){
        for(int nbrs:graph[i]){
           alist.get(nbrs).add(i);
           outdegree[i]++;
        }
       }
       List<Integer> safenodes=new ArrayList<>();
       Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < outdegree.length; i++) {
			if (outdegree[i] == 0) {
				q.add(i);
              
			}
		}
		while (!q.isEmpty()) {
			int r = q.poll();
		safenodes.add(r);
			for(int nbrs:alist.get(r)) {
				outdegree[nbrs]--;
				if(outdegree[nbrs]==0) {
					q.add(nbrs);
				}
			}

		}
         Collections.sort(safenodes);
        return safenodes;
    }
}
class Solution {
    public int longestCycle(int[] edges) {
        int[]in=new int[edges.length];
		for(int i=0;i<edges.length;i++) {
            
            if(edges[i]!=-1)
			   in[edges[i]]++;
		}
		Queue<Integer> q = new LinkedList<>();
		Set<Integer>visited=new HashSet<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int r = q.poll();
			visited.add(r);//jo quueu mein agye vo cyvle ka part nhi honge toh unhe yaad krlenge aur baaki pr kaam krenge
            if(edges[r]!=-1){
			in[edges[r]]--;
			if(in[edges[r]]==0)
				q.add(edges[r]);
            }
		}
		int ans=-1;
		for(int i=0;i<edges.length;i++) {
			if(!visited.contains(i)) {//jo set mein nhi h unpr kaam krenge
				int c=1;
				visited.add(i);
				int nbrs=edges[i];
				while(nbrs!=i) {//jb tk unke nbrs bvapas se us  element pr naa ajaye count add
					c++;
					visited.add(nbrs);
                    
					nbrs=edges[nbrs];
				}
				ans=Math.max(ans, c);//maximum length cycle
				
			}
		}
		return ans;
    }
}
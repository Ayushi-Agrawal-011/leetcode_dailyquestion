class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int n=graph.length;
        int[]out=new int[n];
         for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
         }
        for(int i=0;i<n;i++){
           
             for(int j=0;j<graph[i].length;j++){
                map.get(graph[i][j]).add(i);
                out[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(out[i]==0)
            q.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int r=q.poll();
            ans.add(r);
            for(int nbrs:map.get(r)){
                out[nbrs]--;
                if(out[nbrs]==0)
                q.add(nbrs);
            }

        }
        Collections.sort(ans);
        return ans;
        
    }
}
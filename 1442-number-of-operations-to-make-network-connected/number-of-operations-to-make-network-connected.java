class Solution {
    public int makeConnected(int n, int[][] edges) {
        if(edges.length<n-1)
        return -1;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(edges[i][1]);
             map.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
        if(!visited[i]){
            dfs(i,map,visited);
            c++;
        }
      }
      return c-1;
    }
  
   
    private void dfs(int i, HashMap<Integer, List<Integer>> map, boolean[] visited) {
      visited[i]=true;
      for(int j:map.get(i)){
        if( !visited[j])
        dfs(j,map,visited);
      }

     
}

     
}
class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
      HashMap<Integer,List<Integer>> map=new HashMap<>();
      for(int i=0;i<n;i++){
        map.put(i,new ArrayList<>());

      }  
      for(int[]i:invocations){
        map.get(i[0]).add(i[1]);
      }
      Queue<Integer> q=new LinkedList<>();
      HashSet<Integer> visited=new HashSet<>();
      q.add(k);
      while(!q.isEmpty()){
        int r=q.poll();
        if(visited.contains(r))
        continue;
        visited.add(r);
        for(int nbrs:map.get(r)){
          
                if(!visited.contains(nbrs))
                q.add(nbrs);
            
        }
      }
      System.out.println(visited);
      for(int[]i:invocations){
        if(!visited.contains(i[0]) && visited.contains(i[1])){
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<n;j++){
                ans.add(j);
            }
            return ans;
        }
      }
       //System.out.println(visited);
       List<Integer> ll=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(!visited.contains(i))
        ll.add(i);
       }
      return ll;
    }

}
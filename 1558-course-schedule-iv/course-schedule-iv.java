class Solution {
    private HashMap<Integer,List<Integer>> map;
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
     List<Boolean> ans=new ArrayList<>();
     map=new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
        map.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i=0;i<queries.length;i++){
            boolean res=bfs(queries[i][0],queries[i][1]);
ans.add(res);

        }
        return ans;

    }
    public boolean bfs(int src,int des){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            int r=q.poll();
            if(visited.contains(r))
            continue;
            visited.add(r);
            if(r==des)
            return true;
            for(int nbrs:map.get(r)){
         q.add(nbrs);
            }
        }
        return false;
    }
}
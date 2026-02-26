class Solution {
    private HashMap<Integer,List<Integer>> map;
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] edges, int[][] queries) {
        int n=numCourses;
    map=new HashMap<>();
    for(int i=0;i<n;i++){
    map.put(i,new ArrayList<>());
    }

 for(int i=0;i<edges.length;i++){
 int a=edges[i][0];
 int b=edges[i][1];
 map.get(a).add(b);
    }
List<Boolean> ans=new ArrayList<>();
for(int i=0;i<queries.length;i++){
int a=queries[i][0];
int b=queries[i][1];
boolean res=bfs(a,b);
ans.add(res);
        
    }
    return ans;
}
public boolean bfs(int source,int destination){
  Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(source);
        while(!q.isEmpty()){
            int r=q.poll();
            if(visited.contains(r))
            continue;
            if(r==destination)
            return true;
            visited.add(r);
            for(int nbrs:map.get(r)){
                if(!visited.contains(nbrs))
                q.add(nbrs);
            }
        }
        return false;
}}
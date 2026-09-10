class Solution {
    HashMap<Integer,List<Integer>> map;
    HashSet<Integer> visited;
    public double frogPosition(int n, int[][] edges, int t, int target) {
        map=new HashMap<>();
        visited=new HashSet<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[]e:edges){
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }
        return dfs(1,target,0,t);

    }
public double dfs(int src,int target,int time,int t){
    visited.add(src);
if(time==t){
    if(src==target)
return 1.00;
return 0.00;
}
int c=0;
for(int nbrs:map.get(src)){
    if(!visited.contains(nbrs)){
      c++;
    }
}
  if(src == target){
            if(c == 0)
                return 1.0;
            return 0.0;
        }
double prob=0.0;
for(int nbrs:map.get(src)){
    if(!visited.contains(nbrs)){
       prob+= dfs(nbrs,target,time+1,t)/c;
    }
}
return prob;
}

}
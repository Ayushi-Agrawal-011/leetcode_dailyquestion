class Solution {
    HashMap<Integer,List<Integer>> map;
     HashMap<Integer,Integer> in=new HashMap<>();
          HashMap<Integer,Integer> out=new HashMap<>();
          List<Integer> res=new ArrayList<>();
    public int[][] validArrangement(int[][] edges) {
        map=new HashMap<>();
    
        for(int []ar:edges){
            int a=ar[0];
            int b=ar[1];
           if(!map.containsKey(a)){
            map.put(a,new ArrayList<>());
           }

             if(!map.containsKey(b)){
            map.put(b,new ArrayList<>());
           }
           map.get(a).add(b);
           in.put(b,in.getOrDefault(b,0)+1);
           out.put(a,out.getOrDefault(a,0)+1);
        }
   
        int start=edges[0][0];
        for(int x:out.keySet()){
            if(out.getOrDefault(x,0)-in.getOrDefault(x,0)==1){
                start=x;
                break;
            }
        }
        dfs(start);
        Collections.reverse(res);
           int[][] ans = new int[edges.length][2];
        for (int i = 0; i < res.size() - 1; i++) {
            ans[i][0] = res.get(i);
            ans[i][1] = res.get(i + 1);
        }
        return ans;

    }
    public void dfs(int node){
        List<Integer> v = map.get(node);
while (!v.isEmpty()) {
    int y = v.remove(v.size() - 1); // remove last
    dfs(y);
}
res.add(node);

    
    }
}
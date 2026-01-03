class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
      HashMap<Integer,List<Integer>> map=new HashMap<>();
      for(int i=1;i<=n;i++){
        map.put(i,new ArrayList<>());
      }  
      for(int i=0;i<dislikes.length;i++){
        int a=dislikes[i][0];
        int b=dislikes[i][1];
        map.get(a).add(b);
        map.get(b).add(a);
      }
      Queue<BipartitePair> q=new LinkedList<>();
      HashMap<Integer,Integer> visited=new HashMap<>();
     for(int i=1;i<=n;i++){
        if(visited.containsKey(i))
        continue;
        q.add(new BipartitePair(i,0));
        while(!q.isEmpty()){
            BipartitePair rp=q.poll();
            if(visited.containsKey(rp.vtx)){
                if(visited.get(rp.vtx)!=rp.dist)
                return false;
                continue;
            }
            visited.put(rp.vtx,rp.dist);
            for(int nbrs:map.get(rp.vtx)){
                if(!visited.containsKey(nbrs))
                q.add(new BipartitePair(nbrs,rp.dist+1));
            }
        }

     }
    return true;
    }
    class BipartitePair{
        int vtx;
        int dist;
        public BipartitePair(int vtx,int dist){
            this.vtx=vtx;
            this.dist=dist;
        }
    }
}
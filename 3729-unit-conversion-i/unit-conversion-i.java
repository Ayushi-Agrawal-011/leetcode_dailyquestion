class Solution {
    static final int MOD = 1000000007;
    static HashMap<Integer,HashMap<Integer,Integer>> map;
    public int[] baseUnitConversions(int[][] edges) {
        map=new HashMap<>();
        int n=edges.length;
        for(int i=0;i<=n;i++){
            map.put(i,new HashMap<>());
        }
        for(int []e:edges){
        map.get(e[0]).put(e[1],e[2]);
             map.get(e[1]).put(e[0],e[2]);
        }
        int[] ans=new int[n+1];
        
       Queue<Pair> q=new LinkedList<>();
       HashSet<Integer> visited=new HashSet<>();
       q.add(new Pair(0,1L));
       
       while(!q.isEmpty()){
        Pair r=q.poll();
        if(visited.contains(r.vtx))
        continue;
        visited.add(r.vtx);
        ans[r.vtx]=(int)r.cost %MOD;
        for(int nbrs:map.get(r.vtx).keySet()){
            if(!visited.contains(nbrs))
            q.add(new Pair(
    nbrs,
    (r.cost * map.get(r.vtx).get(nbrs)) % MOD
));
           
        }

       }
       return ans;

    }
    class Pair{
        int vtx;
        long cost;
        public Pair(int vtx,long cost){
            this.vtx=vtx;
            this.cost=cost;
        }
    }
}
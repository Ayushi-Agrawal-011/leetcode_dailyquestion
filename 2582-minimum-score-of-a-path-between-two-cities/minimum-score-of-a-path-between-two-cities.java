class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> map=new ArrayList<>();
        for(int i=0;i<=n;i++){
            map.add(new ArrayList<>());
        }
        for(int[]road:roads){
            int u=road[0];
            int v=road[1];
            int w=road[2];
            map.get(u).add(new Pair(v,w));
                        map.get(v).add(new Pair(u,w));
        }
        Set<Integer> visited=new HashSet<>();
        Queue<Pair> q=new LinkedList<>();
        int ans=Integer.MAX_VALUE;
        q.add(new Pair(1,0));
        visited.add(1);
        while(!q.isEmpty()){
            Pair rp=q.poll();
            int v=rp.vtx;
            int d=rp.dist;
            //visited.add(rp.vtx);
            
        for(Pair nbrs:map.get(rp.vtx)){
            int nv=nbrs.vtx;
            int nd=nbrs.dist;
             ans=Math.min(ans,nd);
            if(!visited.contains(nv)){
            q.add(new Pair(nv,nd));
             visited.add(nv);
            }

        }
        }
        return ans;
    }
    class Pair{
        int vtx;
        int dist;
        public Pair(int vtx,int dist){
            this.vtx=vtx;
            this.dist=dist;
        }
    }
}
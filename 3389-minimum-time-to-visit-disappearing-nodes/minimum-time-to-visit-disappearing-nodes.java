class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new   HashMap<>());
        }
        for(int i=0;i<edges.length;i++){
  int u = edges[i][0];
int v = edges[i][1];
int w = edges[i][2];

map.get(u).put(v, Math.min(map.get(u).getOrDefault(v, Integer.MAX_VALUE), w));
map.get(v).put(u, Math.min(map.get(v).getOrDefault(u, Integer.MAX_VALUE), w));
        }
        int[]ans=new int[n];
        Arrays.fill(ans,-1);
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->(a.cost-b.cost));
        HashSet<Integer> visited=new HashSet<>();
        q.add(new Pair(0,0));
        while(!q.isEmpty()){
            Pair rp=q.poll();
            if(visited.contains(rp.vtx) || (rp.cost>=disappear[rp.vtx]))
             continue;
             ans[rp.vtx]=rp.cost;
             visited.add(rp.vtx);
             for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost=map.get(rp.vtx).get(nbrs);
                q.add(new Pair(nbrs,rp.cost+cost));
                }
             }
        }
        return ans;
    }
    class Pair{
int vtx;
int cost;

public Pair(int vtx,int cost){
    this.vtx=vtx;
    this.cost=cost;
  
}
    }
}
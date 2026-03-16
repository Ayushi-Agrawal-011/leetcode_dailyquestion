class Solution {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public int networkDelayTime(int[][] times, int n, int k) {
        map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new HashMap<>());
        }
        for(int i=0;i<times.length;i++){
            int a=times[i][0];
            int b=times[i][1];
            int w=times[i][2];
            map.get(a).put(b,w);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.time-b.time));
        pq.add(new Pair(k,0));
        int c=0,ans=0;
         boolean[] visited=new boolean[n+1];
        while(!pq.isEmpty()){
Pair rp=pq.poll();
if(visited[rp.vtx])
continue;
visited[rp.vtx]=true;
c++;
ans=Math.max(ans,rp.time);
for(int nbrs:map.get(rp.vtx).keySet()){
    int cost=map.get(rp.vtx).get(nbrs);
    pq.add(new Pair(nbrs,rp.time+cost));
}
        }
        return c==n?ans: -1;
    }
    class Pair{
        int vtx;
       
        int time;
        public Pair(int vtx,int time){
            this.vtx=vtx;
            this.time=time;
          
        }
    }
}
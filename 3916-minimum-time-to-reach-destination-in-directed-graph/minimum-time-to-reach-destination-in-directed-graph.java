class Solution {
    public int minTime(int n, int[][] edges) {
        HashMap<Integer,List<int[]>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }

for(int[]e:edges){
    map.get(e[0]).add(new int[]{e[1],e[2],e[3]});
}
PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.time-b.time));

int[]dist=new int[n];
Arrays.fill(dist,Integer.MAX_VALUE);
dist[0]=0;
pq.add(new Pair(0,0));
while(!pq.isEmpty()){
    Pair rp=pq.poll();
    if(rp.time>dist[rp.vtx])
    continue;
    if(rp.vtx==n-1){
        return rp.time;
    }
  
    
for(int[] l:map.get(rp.vtx)){
    int v=l[0];
    int s=l[1];
    int e=l[2];

    if(rp.time<=e){
        if(rp.time<s){
        if(s+1<dist[v]){
       dist[v]=s+1;
       pq.add(new Pair(v,dist[v]));
        }}
    
    else {
      if(rp.time+1<dist[v]){
        dist[v]=rp.time+1;
        pq.add(new Pair(v,rp.time+1));
      }}
    }}

}


return -1;
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
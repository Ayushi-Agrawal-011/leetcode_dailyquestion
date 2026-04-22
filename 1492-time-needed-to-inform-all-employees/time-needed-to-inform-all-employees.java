class Solution {
    public int numOfMinutes(int n, int headId, int[] manager, int[] informTime) {
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(i,new ArrayList<>());
    }
    for(int i=0;i<n;i++){
        if(manager[i]!=-1)
        map.get(manager[i]).add(i);
    }
    int ans=0;
    Queue<Pair> q=new LinkedList<>();
    q.add(new Pair(headId,informTime[headId]));
    while(!q.isEmpty()){
        Pair rp=q.poll();
        for(int sub:map.get(rp.vtx)){
            ans=Math.max(ans,rp.time+informTime[sub]);
            q.add(new Pair(sub,rp.time+informTime[sub]));
        }
    }
    return ans;


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
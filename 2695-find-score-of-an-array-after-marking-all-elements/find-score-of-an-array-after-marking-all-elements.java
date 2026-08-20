class Solution {
    public long findScore(int[] nums) {
      PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.vtx!=b.vtx?(a.vtx-b.vtx):(a.i-b.i));
      int n=nums.length;
      for(int i=0;i<nums.length;i++){
        Pair rp=new Pair(nums[i],i);
if(i>0){
    rp.nbrs.add(i-1);
}
if(i<n-1){
rp.nbrs.add(i+1);
}
        pq.add(rp);


      }  
      boolean[] marked=new boolean[nums.length];
      long score=0;
      while(!pq.isEmpty()){
Pair rp=pq.poll();
if(marked[rp.i])
continue;
      
      score+=rp.vtx;
   marked[rp.i]=true;
      for(int x:rp.nbrs){
marked[x]=true;
      }}
return score;
    }
    }
    class Pair{
        int vtx;
        int i;
        
        List<Integer> nbrs;
        public Pair(int vtx,int i){
            this.vtx=vtx;
            this.i=i;
            nbrs=new ArrayList<>();
        }
    
}
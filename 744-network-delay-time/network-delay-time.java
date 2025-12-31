class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
      HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
	for(int i=1;i<=n;i++) {
					if(!map.containsKey(i))
			map.put(i,new HashMap<>());
         
	}  
    for(int i=0;i<times.length;i++) {
					
			int a=times[i][0];
            int b=times[i][1];
            int cost=times[i][2];
            map.get(a).put(b,cost);
         
	} 
    int ans=0;
    PriorityQueue<DijkstraPair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
		HashSet<Integer> visited=new HashSet<>();
		pq.add(new  DijkstraPair(k,0));
        int c=0;
		while(!pq.isEmpty()) {
			//1-remove
			 DijkstraPair rp=pq.poll();
             
          
			 //2-ignore if visited
			 if(visited.contains(rp.vtx))
				 continue;
			 //3-marked visited
			 visited.add(rp.vtx);
			 //4-self work
			 c++;
              ans=Math.max(ans,rp.cost);
			 //5-add nbrs
     for(int nbrs:map.get(rp.vtx).keySet()) {
    	 if(!visited.contains(nbrs)) {
    		 int cost=map.get(rp.vtx).get(nbrs);
    		 pq.add(new DijkstraPair(nbrs,rp.cost+cost));
    		 
    	 }
    	 
     }}
     if(c!=n)
  return -1;

     return ans;
    }
    class DijkstraPair{
  int vtx;

  int cost;
  public  DijkstraPair(int vtx,int cost) {
	  this.vtx=vtx;
	
	  this.cost=cost;
  }
  

    }

}
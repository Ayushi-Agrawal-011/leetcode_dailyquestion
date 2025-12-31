class Solution {
    public int minCost(int n, int[][] times) {
         HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
	for(int i=0;i<n;i++) {
					if(!map.containsKey(i))
			map.put(i,new HashMap<>());
         
	}  
    for(int i=0;i<times.length;i++) {
					
			int a=times[i][0];
            int b=times[i][1];
            int cost=times[i][2];
          if(map.get(a).containsKey(b)){
             cost=Math.min(cost,map.get(a).get(b));
            map.get(a).put(b,cost);
          }
          else
           map.get(a).put(b,cost);
              if(map.get(b).containsKey(a)){
             cost=Math.min(2*cost,map.get(b).get(a));
            map.get(b).put(a,cost);
          }
          else
           map.get(b).put(a,2*cost);
         
	} 
   int ans=-1;
    PriorityQueue<DijkstraPair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
		HashSet<Integer> visited=new HashSet<>();
		pq.add(new  DijkstraPair(0,0));
     
		while(!pq.isEmpty()) {
			//1-remove
			 DijkstraPair rp=pq.poll();
          if(visited.contains(rp.vtx))
          continue;
          
			 //2-ignore if visited
			     
           
     
             if(rp.vtx==n-1)
 return rp.cost;
    visited.add(rp.vtx);
			 //3-marked visited

			 //4-self work
	
			 //5-add nbrs
     for(int nbrs:map.get(rp.vtx).keySet()) {
    	if(!visited.contains(nbrs)){
    		 int cost=map.get(rp.vtx).get(nbrs);
    		 pq.add(new DijkstraPair(nbrs,rp.cost+cost));
    		 
        } 
    	 
     }}
 
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
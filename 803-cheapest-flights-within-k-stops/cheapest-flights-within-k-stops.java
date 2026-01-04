class Solution {
    public int findCheapestPrice(int n, int[][] times, int src, int dst, int k) {
       HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
	for(int i=0;i<n;i++) {
					if(!map.containsKey(i))
			map.put(i,new HashMap<>());
         
	}  
    for(int i=0;i<times.length;i++) {
					
			int a=times[i][0];
            int b=times[i][1];
            int cost=times[i][2];
            map.get(a).put(b,cost);
         
	} 
    int[][]dist=new int[n][k+2];
    for(int[]ar:dist){
        Arrays.fill(ar,Integer.MAX_VALUE);
    }
   int ans=Integer.MAX_VALUE;
  Queue<DijkstraPair> q=new LinkedList<>();
	
	q.add(new  DijkstraPair(src,0,-1));
        dist[src][0]=0;
     
		while(!q.isEmpty()) {
			//1-remove
			 DijkstraPair rp=q.poll();
          
          if(rp.cost>=ans)
          continue;
			 //2-ignore if visited
		
            if(rp.stops>k){
                continue;
            } 
            	      if(rp.vtx==dst){
                        ans=Math.min(ans,rp.cost);
                        continue;
                      }
                      if(rp.stops==k)
                      continue;
      
            
			 //3-marked visited

			 //4-self work
	
			 //5-add nbrs
     for(int nbrs:map.get(rp.vtx).keySet()) {
    	
    		 int cost=map.get(rp.vtx).get(nbrs);
             int newcost=cost+rp.cost;
             int newstops=rp.stops+1;
             if(newstops+1>=k+2)
             continue;
    		 if(newcost<dist[nbrs][newstops+1]){
                 dist[nbrs][newstops+1]=newcost;
                q.add(new DijkstraPair(nbrs,newcost,newstops));
             }
    		 
    	 
    	 
     }}
 if(ans==Integer.MAX_VALUE)
  return -1;
  return ans;

    }
    class DijkstraPair{
  int vtx;
int stops;
  int cost;
  public  DijkstraPair(int vtx,int cost,int stops) {
	  this.vtx=vtx;
	this.cost=cost;
	this.stops=stops;
  }
  
  
    }
}
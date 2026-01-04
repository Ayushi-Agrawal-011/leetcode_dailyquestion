class Solution {
    public int countPaths(int n, int[][] roads) {
        HashMap<Integer,HashMap<Integer,Long>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
         int mod = 1000000007;
        for(int i=0;i<roads.length;i++){
            int a=roads[i][0];
            int b=roads[i][1];
            long c=roads[i][2];
            map.get(a).put(b,c);
              map.get(b).put(a,c);
        }
          
  PriorityQueue<DijkstraPair> q=new PriorityQueue<>((a,b)->{
            return Long.compare(a.cost,b.cost);
        });
	
	q.add(new  DijkstraPair(0,0));
    long[]dist=new long[n];
 
        Arrays.fill(dist,Long.MAX_VALUE);
    
        dist[0]=0L;
     
        long ways[] = new long[n];
        ways[0]=1L;
		while(!q.isEmpty()) {
			//1-remove
			 DijkstraPair rp=q.poll();
          
          if(dist[rp.vtx]<rp.cost)
          continue;
      
            
			 //3-marked visited

			 //4-self work
	
			 //5-add nbrs
     for(int nbrs:map.get(rp.vtx).keySet()) {
    	
    		 long newcost=map.get(rp.vtx).get(nbrs)+rp.cost;
             
    		 if(newcost<dist[nbrs]){
                 dist[nbrs]=newcost;
                 ways[nbrs]=ways[rp.vtx];
                q.add(new DijkstraPair(nbrs,newcost));
             }
             else if(dist[nbrs]==newcost)
             ways[nbrs]=(ways[nbrs]+ways[rp.vtx])%mod;
    		 
    	 
    	 
     }}
 return (int)ways[n-1];
    }
     class DijkstraPair{
  int vtx;

  long cost;
  public  DijkstraPair(int vtx,long cost) {
	  this.vtx=vtx;
	this.cost=cost;
  }}
}
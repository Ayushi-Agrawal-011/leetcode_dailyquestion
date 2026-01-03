class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingfees) {
    HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    int n=passingfees.length;
    for(int i=0;i<n;i++){
        map.put(i,new HashMap<>());
    }    
      for(int i=0;i<edges.length;i++){
        int u=edges[i][0];
        int v=edges[i][1];
        int w=edges[i][2];
      map.get(u).put(
    v,
    Math.min(map.get(u).getOrDefault(v, Integer.MAX_VALUE), w));
        map.get(v).put(
    u,
    Math.min(map.get(v).getOrDefault(u, Integer.MAX_VALUE), w));
    } 
    	PriorityQueue<DijkstraPair> pq=new PriorityQueue<>((a,b)->(a.fees-b.fees));
		int[] minTime = new int[n];
         Arrays.fill(minTime, Integer.MAX_VALUE);
		pq.add(new  DijkstraPair(0,0,passingfees[0]));
		while(!pq.isEmpty()) {
			//1-remove
			 DijkstraPair rp=pq.poll();
			 //2-ignore if visited
			 if( rp.time>maxTime ||rp.time>=minTime[rp.vtx])
				 continue;
			 //3-marked visited
		
			 //4-self work
		if(rp.vtx==n-1)
        return rp.fees;
        minTime[rp.vtx]=rp.time;
			 //5-add nbrs
     for(int nbrs:map.get(rp.vtx).keySet()) {
    	
    		 int cost=map.get(rp.vtx).get(nbrs);
             if(cost+rp.time<=maxTime){
    		 pq.add(new DijkstraPair(nbrs,rp.time+cost,rp.fees+passingfees[nbrs]));
             }
    		 
    	 
    	 
     }  
 
    }
        return -1;}
    class DijkstraPair{
  int vtx;

  int time;

  int fees;
      public DijkstraPair(int vtx,int time,int fees){
  this.vtx=vtx;
	  this.time=time;
      this.fees=fees;
      }
    
}}
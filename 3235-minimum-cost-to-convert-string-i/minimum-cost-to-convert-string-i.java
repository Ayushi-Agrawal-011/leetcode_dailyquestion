class Solution {
        private HashMap<Character,HashMap<Character,Integer>> map;
        private long[][]mincost=new long[26][26];
    public long minimumCost(String s, String t, char[] o, char[] c, int[] cost) {
     
 map=new HashMap<>();
	for(int i=0;i<o.length;i++) {
			if(!map.containsKey(o[i]))
			map.put(o[i],new HashMap<>());
            map.get(o[i]).put(
    c[i],
    Math.min(
        map.get(o[i]).getOrDefault(c[i], Integer.MAX_VALUE),
        cost[i]
    )
);
         
		
	}
    for(char ch='a';ch<='z';ch++){
        Arrays.fill(mincost[ch-'a'],Long.MAX_VALUE);
        mincost[ch-'a']=Dijkstra(ch);
    }
  long so=0;
  for(int i=0;i<s.length();i++){
  long cp = mincost[s.charAt(i)-'a'][t.charAt(i)-'a'];
    if (cp == Long.MAX_VALUE) return -1;  // unreachable
    so += cp;
  }
  return so;
    }
	
	
	class DijkstraPair{
  char vtx;
 
  long cost;
  public  DijkstraPair(char vtx,long cost) {
	  this.vtx=vtx;
	
	  this.cost=cost;
  }
  @Override
	public String toString() {
		return vtx +" "+cost;
	}

	}
	public long [] Dijkstra( char src) {
long[] dist = new long[26];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[src - 'a'] = 0;

		PriorityQueue<DijkstraPair> pq=new PriorityQueue<>((a,b)->Long.compare(a.cost, b.cost));
    
		HashSet<Character> visited=new HashSet<>();
		pq.add(new  DijkstraPair(src,0));
		while(!pq.isEmpty()) {
			//1-remove
			 DijkstraPair rp=pq.poll();
         int ch=rp.vtx-'a';
			 //2-ignore if visited
			 if(visited.contains(rp.vtx))
				 continue;
			 //3-marked visited
			 visited.add(rp.vtx);
			 //4-self work
		
			 //5-add nbrs
               if (!map.containsKey(rp.vtx)) continue;
             
     for(char nbrs:map.get(rp.vtx).keySet()) {
        int v=nbrs-'a';
        long dis=map.get(rp.vtx).get(nbrs);
        if(!visited.contains(nbrs) && dist[ch]+dis<dist[v]){
            dist[v]=dist[ch]+dis;
              pq.add(new DijkstraPair(nbrs, dist[v]));
        }
    	}
     
    	 
     
		   
		}
          return dist;	
	}
}
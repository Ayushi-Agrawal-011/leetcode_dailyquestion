class Solution {
      private HashMap<Points, HashMap<Points,Integer>> map;
    public int minCostConnectPoints(int[][] points) {
      map = new HashMap<>();
		for (int i = 0; i <points.length; i++) {
			Points p=new Points(points[i][0],points[i][1]);
            map.put(p,new HashMap<>());
            for(int j=0;j<points.length;j++){
                if(j==i){
continue;
                }
               Points p1= new Points(points[j][0],points[j][1]);
               int cost=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
               map.get(p).put(p1,cost);
            }
		}  
 return  PrimsAlgorithm();
    }
    class Points{
        int  x;
        int y;
        public Points(int x,int y){
            this.x=x;
            this.y=y;
        }
         @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Points)) return false;
            Points p = (Points) o;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
	class PrimsPair {
		Points vtx;
		Points acq_vtx;
		int cost;

		public PrimsPair(Points vtx, Points acq_vtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acq_vtx = acq_vtx;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return vtx+" "+acq_vtx+" @ "+cost;
		}
	}

	public int PrimsAlgorithm() {
//		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>(){     
//			@Override
//			public int compare(PrimsPair o1, PrimsPair o2) {
//				return o1.cost-o2.cost;
//			}
//		}); 
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a,b)-> a.cost-b.cost);
		HashSet<Points> visited = new HashSet<>();
	Points start = map.keySet().iterator().next();
        pq.add(new PrimsPair(start, null, 0));
        int t=0;
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair rp = pq.poll();
			// 2. Ignore if Already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.vtx);
			// 4. Self work
		t+=rp.cost;
			// 5. Add nbrs
			for(Points nbrs:map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost=map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}
			}

		}
        return t;
	}
}
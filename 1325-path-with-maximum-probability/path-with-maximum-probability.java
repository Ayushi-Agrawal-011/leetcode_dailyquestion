class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        HashMap<Integer,HashMap<Integer,Double>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).put(edges[i][1],succProb[i]);
              map.get(edges[i][1]).put(edges[i][0],succProb[i]);
        }
                double[] dist = new double[n];
                dist[start]=1;
 Arrays.fill(dist, 0);
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Double.compare(b.prob,a.prob));
        pq.add(new Pair(start,1));
        while(!pq.isEmpty()){
            Pair rp=pq.poll();
            
            if(rp.vtx==end)
            return rp.prob;
            for(int nbrs:map.get(rp.vtx).keySet()){
                double nprob=rp.prob*map.get(rp.vtx).get(nbrs);
                if(nprob>dist[nbrs]){
                    dist[nbrs]=nprob;
                    pq.add(new Pair(nbrs,nprob));

                }
            }
        }
        return dist[end];
    }
    class Pair{
     int vtx;
        double prob;
        public Pair(int vtx,double prob){
            this.vtx=vtx;
            this.prob=prob;
        }

    }
}
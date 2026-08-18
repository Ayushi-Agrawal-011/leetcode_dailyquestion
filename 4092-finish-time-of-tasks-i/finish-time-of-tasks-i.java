

class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {

        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }

        int[] in = new int[n];

        for(int[] e:edges){
            map.get(e[1]).add(e[0]);
            in[e[0]]++;
        }

        Queue<Pair> q = new LinkedList<>();

        // parent ke earliest/latest yahin store honge
        Pair[] p = new Pair[n];

        for(int i=0;i<n;i++){
            p[i] = new Pair(i,0,Long.MAX_VALUE,Long.MIN_VALUE);
        }

        for(int i=0;i<n;i++){
            if(in[i]==0){
                q.add(new Pair(
                    i,
                    baseTime[i],
                    baseTime[i],
                    baseTime[i]
                ));
            }
        }

        while(!q.isEmpty()){

            Pair rp = q.poll();

            if(rp.vtx==0)
                return rp.finish;

            for(int nbrs:map.get(rp.vtx)){

                // current child ka finish parent mein store
                p[nbrs].earlier =
                    Math.min(p[nbrs].earlier,rp.finish);

                p[nbrs].latest =
                    Math.max(p[nbrs].latest,rp.finish);

                in[nbrs]--;

                if(in[nbrs]==0){

                    long own =
                        (p[nbrs].latest-p[nbrs].earlier)
                        +baseTime[nbrs];

                    long nfinish =
                        p[nbrs].latest+own;

                    q.add(new Pair(
                        nbrs,
                        nfinish,
                        p[nbrs].earlier,
                        p[nbrs].latest
                    ));
                }
            }
        }

        return 0;
    }

    class Pair{
        int vtx;
        long finish;
        long earlier;
        long latest;

        public Pair(int vtx,long finish,long earlier,long latest){
            this.vtx=vtx;
            this.finish=finish;
            this.earlier=earlier;
            this.latest=latest;
        }
    }
}
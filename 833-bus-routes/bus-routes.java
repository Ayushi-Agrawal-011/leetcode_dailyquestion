class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source==target)
        return 0;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<routes.length;i++){
            for(int stop:routes[i]){
                if(!map.containsKey(stop))
                map.put(stop,new ArrayList<>());
                map.get(stop).add(i);
            }
        }
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(source,0));
        Set<Integer> vstops=new HashSet<>();
        vstops.add(source);
        boolean []vbus=new boolean[routes.length];
        while(!q.isEmpty()){
            Pair rp=q.poll();
            int cur=rp.stop;
            int dists=rp.dist;
            if(cur==target)
            return dists;
             for (int bus : map.getOrDefault(cur, new ArrayList<>())) {
                if(vbus[bus])
                continue;
                vbus[bus]=true;
                for(int nextstop:routes[bus]){
                    if(!vstops.contains(nextstop)){
                        vstops.add(nextstop);
                        q.add(new Pair(nextstop,dists+1));
                    }
                }
             }
        }
        return -1;
    }
    class Pair{
        int stop;
        int dist;
        public Pair(int stop,int dist){
        this.stop=stop;
        this.dist=dist;
        }
    }
}
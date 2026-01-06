class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());

        }
    HashSet<Integer> rs = new HashSet<>();
for (int x : restricted) {
    rs.add(x);
}
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(0);
        int c=0;
        while(!q.isEmpty()){
            int r=q.poll();
            if(visited.contains(r))
            continue;
            if(rs.contains(r))
            continue;
            c++;
            visited.add(r);
            for(int nbrs:map.get(r)){
                if(!visited.contains(nbrs))
                q.add(nbrs);
            }
        }
        return c;
    }
}
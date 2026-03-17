class Solution {
    public boolean canFinish(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int[]in=new int[n];
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
            

        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(edges[i][1]);
            in[edges[i][1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i]==0)
            q.add(i);
        }
        int c=0;
        while(!q.isEmpty()){
int r=q.poll();
c++;
for(int nbrs:map.get(r)){
    in[nbrs]--;
    if(in[nbrs]==0)
    q.add(nbrs);
}
        }
        return c==n;
    }
}
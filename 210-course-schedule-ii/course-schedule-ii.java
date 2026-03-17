class Solution {
    public int[] findOrder(int n, int[][] edges) {
          HashMap<Integer,List<Integer>> map=new HashMap<>();
        int[]in=new int[n];
      int[]arr=new int[n];
      int j=0;
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
            

        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][1]).add(edges[i][0]);
            in[edges[i][0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i]==0)
            q.add(i);
        }
    
        while(!q.isEmpty()){
int r=q.poll();
arr[j]=r;
j++;

for(int nbrs:map.get(r)){
    in[nbrs]--;
    if(in[nbrs]==0)
    q.add(nbrs);
}
        }
        return j==n?arr:new int[0];
    }
}
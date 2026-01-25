class Solution {
    HashMap<Integer,List<Integer>> map;
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
            int[]dist1=bfs(n,x);
              int[]dist2=bfs(n,y);
                int[]dist3=bfs(n,z);
        
int c=0;
for(int i=0;i<n;i++){

    int[]arr=new int[3];
    arr[0]=dist1[i];
    arr[1]=dist2[i];
    arr[2]=dist3[i];
    Arrays.sort(arr);
    int a=arr[0];
    int b=arr[1];
    int cd=arr[2];
    if((a*a)+(b*b)==(cd*cd))
    c++;
}
return c;
    }
    public int[] bfs(int n,int src){
        int[]dist=new int[n];
        Arrays.fill(dist,-1);
        dist[src]=0;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{src,0});
        while(!q.isEmpty()){
            int []a=q.poll();
            int r=a[0];
            for(int nbrs:map.get(r)){
                if(dist[nbrs]==-1){
                int nd=a[1]+1;
                dist[nbrs]=nd;
                q.add(new int[]{nbrs,nd});
                }
            }
        }
        return dist;
    }
}
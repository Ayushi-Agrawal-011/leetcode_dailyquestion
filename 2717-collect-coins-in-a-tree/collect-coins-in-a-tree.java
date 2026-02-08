class Solution {
    public int collectTheCoins(int[] coins, int[][] edges) {
        int n=coins.length;
        if(edges.length==0)
        return 0;
        int ans=n;
       HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(i,new HashSet<>());
       }
       int[]deg=new int[n];
       for(int i=0;i<edges.length;i++){
        int a=edges[i][0];
        int b=edges[i][1];
        map.get(a).add(b);
        map.get(b).add(a);
        deg[a]++;
        deg[b]++;
       }
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<n;i++){
        if(deg[i]==1 && coins[i]==0)
        q.add(i);
       }
       while(!q.isEmpty()){
        int r=q.poll();
        ans--;
        for(int nbrs:map.get(r)){
            deg[nbrs]--;
            if(deg[nbrs]==1 && coins[nbrs]==0)
            q.add(nbrs);
        }}
        for(int i=0;i<n;i++){
            if(deg[i]==1 && coins[i]==1)
            q.add(i);
        }
        ans-=q.size();
        for(int ele:q){
            deg[ele]--;
            for(int nbr:map.get(ele)){
                deg[nbr]--;
                if(deg[nbr]==1){
                    ans--;
                }
            }
        }
        
       
       return Math.max(0,(ans-1)*2);
    }
}
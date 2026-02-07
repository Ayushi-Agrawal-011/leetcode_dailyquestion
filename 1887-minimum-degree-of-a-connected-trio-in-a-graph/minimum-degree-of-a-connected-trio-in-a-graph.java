class Solution {
    HashMap<Integer,HashSet<Integer>> map;
    public int minTrioDegree(int n, int[][] edges) {
        map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new HashSet<>());
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)){
                for(int j=i+1;j<=n;j++){
                    if(map.get(i).contains(j)){
                        for(int k=j+1;k<=n;k++){
                            if(map.get(j).contains(k) && map.get(i).contains(k)){
                                int a=map.get(i).size();
                                int b=map.get(j).size();
                                int c=map.get(k).size();
                                ans=Math.min(ans,a+b+c-6);
                            }
                        }
                    }
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1 :ans;
    }
}
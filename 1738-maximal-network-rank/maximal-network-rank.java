class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {int[]deg=new int[n];
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    for (int i = 0; i < n; i++){
            map.put(i, new ArrayList<>());
    }
        for(int i=0;i<roads.length;i++){
deg[roads[i][0]]++;
deg[roads[i][1]]++;


map.get(roads[i][0]).add(roads[i][1]);
map.get(roads[i][1]).add(roads[i][0]);
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int rank=deg[i]+deg[j];
                if(map.get(i).contains(j))
                rank--;
                if(rank>maxi)
                maxi=rank;
            }
        }
        return maxi;
    }
}
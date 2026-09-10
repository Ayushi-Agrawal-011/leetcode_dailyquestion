class Solution {
      HashMap<Integer,List<Integer>> map;
      HashSet<Integer> visited;
    public int countGoodNodes(int[][] edges) {
       map = new HashMap<>();
      visited = new HashSet<>();
int n = edges.length + 1;
for(int i=0;i<n;i++){
    map.put(i,new ArrayList<>());
}

for(int[] e:edges){
    map.get(e[0]).add(e[1]);
    map.get(e[1]).add(e[0]);
}
return dfs(0).c;
    }
    public Pair  dfs(int vtx){

        visited.add(vtx);

        int size = 1;
        int good = 0;
        int firstSize = -1;
        boolean same = true;

        for(int nbrs:map.get(vtx)){
            if(!visited.contains(nbrs)){
                Pair rp=dfs(nbrs);
                size+=rp.size;
                good+=rp.c;
                if(firstSize==-1)
                firstSize=rp.size;
                else if(firstSize!=rp.size)
                same=false;
            }}
            if(same)
            good++;
            return new Pair(vtx,size,good);
    }
    class Pair{
        int vtx;
        int size;
        int c;
        public Pair(int vtx,int size,int c){
            this.vtx=vtx;
            this.size=size;
            this.c=c;
        }
    }
    
}
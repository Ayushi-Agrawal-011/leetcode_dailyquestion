class Solution {
    private   HashMap<Integer,HashMap<Integer,Integer>> map;
    public int maximumDetonation(int[][] bombs) {
     map =new HashMap<>();
    
        for(int i=0;i<bombs.length;i++){
            
            int x=bombs[i][0];
            int y=bombs[i][1];
            int r=bombs[i][2];
            map.put(x,new HashMap<>());
            map.get(x).put(y,r);
        }
        int[]ans=new int[bombs.length];
        for(int i=0;i<bombs.length;i++){
             boolean []visited=new boolean[bombs.length];
            int a=dfs(bombs,i,visited);
            ans[i]=a;
        }
        return Arrays.stream(ans).max().getAsInt();

    }
    public int dfs(int[][]bomb,int i,boolean[]visited){
 
visited[i]=true;
int count=1;
for(int j=0;j<bomb.length;j++){
    if(!visited[j]){
        long a=bomb[i][0];
    long  b=bomb[i][1];
        long  p=bomb[j][0];
        long  q=bomb[j][1];
        long  r=bomb[i][2];
        long  dist=(a-p)*(a-p)+(b-q)*(b-q);
        if(dist<=r*r)
        count+=dfs(bomb,j,visited);
    }
  
}
  return count;
    }
}
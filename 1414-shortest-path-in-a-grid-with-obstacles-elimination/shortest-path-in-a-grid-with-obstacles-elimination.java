class Solution {
    public int shortestPath(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.steps-b.steps));
       boolean[][][] visited = new boolean[n][m][k+1];
       pq.add(new Pair(0,0,k,0));
       int[][]dirs={{1,0},{-1,0},{0,-1},{0,1}};
       while(!pq.isEmpty()){
        Pair rp=pq.poll();
        if(rp.k<0 )
        continue;
       if(rp.r==n-1 && rp.c==m-1)
       return rp.steps;
       for(int []d:dirs){
        int nr=rp.r+d[0];
        int nc=rp.c+d[1];
        if(nr<0 || nc<0 || nr>=n || nc>=m)
continue;
    
    int nk=-1;
    if(grid[nr][nc]==1)
     nk=rp.k-1;
    else
      nk=rp.k;
      if(nk < 0) 
    continue;
      if(!visited[nr][nc][nk]){
        visited[nr][nc][nk]=true;
     pq.add(new Pair(nr,nc,nk,rp.steps+1));
      }
       }

       } 
       return -1;
    }
    class Pair{
int r;
int c;
int k;
int steps;
public Pair(int r,int c,int k,int steps){
    this.r=r;
    this.c=c;
    this.k=k;
    this.steps=steps;
}
    }
}
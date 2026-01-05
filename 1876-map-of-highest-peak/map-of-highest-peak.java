class Solution {
    public int[][] highestPeak(int[][] mat) {
        
 
        int[][]ans=new int[mat.length][mat[0].length];
   Queue<Pair> q=new LinkedList<>();
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1){
                q.add(new Pair(i,j,0));
                ans[i][j]=0;
            }
            else{
           
                ans[i][j]=-1;
            }
        }
    }
    int[][]d={{-1,0},{1,0},{0,-1},{0,1}};
    while(!q.isEmpty()){
            Pair rp=q.poll();
           
            for(int[]nbrs:d){
                int nr=rp.r+nbrs[0];
                int nc=rp.c+nbrs[1];
             
if (nr >= 0 && nc >= 0 && nr < mat.length && nc < mat[0].length && ans[nr][nc] ==-1) {
                    ans[nr][nc] = ans[rp.r][rp.c]+1; // visited
                    q.add(new Pair(nr, nc, ans[nr][nc]));
                }
            }
         }
    return ans;
    }
     class Pair{
    int r;
    int c;
    int dist;
    public Pair(int r,int c,int dist){
        this.r=r;
        this.c=c;
        this.dist=dist;
    }
   }
   
}
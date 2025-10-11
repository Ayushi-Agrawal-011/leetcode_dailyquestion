class Solution {
  int c=0;
    public int uniquePathsIII(int[][] grid) {
   
int start=0,end=0,d=0,e=0;
for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        if(grid[i][j]==0)
        d++;
        if(grid[i][j]==1){
            start=i;
            end=j;
        }
    }

}
path(grid,start,end,d,0);
return c;
    }
    public void path(int [][] grid,int cr,int cc,int d,int e){

if(cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]==-1){
    return;
}
if(grid[cr][cc]==2 && d==e){
    c++;
    return;
}
int a=grid[cr][cc];
grid[cr][cc]=-1;
  int [] rs={0,0,-1,1,};
     int [] cs={-1,1,0,0};
     for(int i=0;i<4;i++){
     path(grid,cr+rs[i],cc+cs[i],d,a==0 ?e+1:e);
     }
     grid[cr][cc]=a;

    }
  

}
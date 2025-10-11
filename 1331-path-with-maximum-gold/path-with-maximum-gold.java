class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans=0;
for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
if(grid[i][j]!=0){
    ans=Math.max(ans,MaxGold(grid,i,j));
}
    }

}
return ans;
    }
 public int MaxGold(int [][]grid,int cr,int cc){
    if(cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]==0){
        return 0;
    }
    int a=grid[cr][cc];
    grid[cr][cc]=0;
    int b=0;
    int [] rs={0,0,-1,1,};
     int [] cs={-1,1,0,0};
     for(int i=0;i<4;i++){
        b=Math.max(b,MaxGold(grid,cr+rs[i],cc+cs[i]));
     }
     grid[cr][cc]=a;
return a+b;
 }
}
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1)
            ans=Math.max(ans,fn(grid,i,j));
        }
      }
     return ans;   
    }
    public int fn(int[][] grid,int i,int j){
     if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 )
     return 0;
     grid[i][j]=0;
     int a=fn(grid,i-1,j);
     int b=fn(grid,i+1,j);
     int c=fn(grid,i,j-1);
     int d=fn(grid,i,j+1);
     return a+b+c+d+1;
    }
}
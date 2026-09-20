class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
       int[][] ans=new int[grid.length][grid[0].length];
       for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans[0].length;j++){
            ans[i][j]=grid[i][j];
        }
       } 
 dfs(grid,row,col,color,grid[row][col],ans);
        return ans;
    }

    public void dfs(int[][] grid, int i, int j,int color,int original,int[][]ans) {
        if (i > grid.length-1 || j > grid[0].length-1 || i < 0 || j < 0 || 
    grid[i][j]!=original || grid[i][j]==-1){
         return;
        }
        // boolean border=false;
        // if (i == grid.length-1 || j == grid[0].length-1 || i == 0 || j == 0 || 
        // grid[i+1][j]!=original || grid[i-1][j]!=original || grid[i][j-1]!=original || grid[i][j+1]!=original){
        //  border=true;
        // }
           boolean border=false;

if (i == grid.length-1 || j == grid[0].length-1 || i == 0 || j == 0)
    border=true;

if (i < grid.length-1 && grid[i+1][j] != original && grid[i+1][j] != -1)
    border=true;

if (i > 0 && grid[i-1][j] != original && grid[i-1][j] != -1)
    border=true;

if (j < grid[0].length-1 && grid[i][j+1] != original && grid[i][j+1] != -1)
    border=true;

if (j > 0 && grid[i][j-1] != original && grid[i][j-1] != -1)
    border=true;
           grid[i][j]=-1;
        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, -1, 1 };
   
        for (int k = 0; k < 4; k++) {
            int nr = i + r[k];
            int nc = j + c[k];
           
              dfs(grid, nr, nc,color,original,ans);
               
            
        }
        if(border)
        ans[i][j]=color;
        
    }
}
class Solution {
    public int numIslands(char[][] grid) {
       // boolean[][]visited=new boolean[grid.length][grid[0].length];
        int c=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' ){
                c++;
                dfs(grid,i,j);

            }
        }
    }    
    return c;
    }
    public void dfs(char[][]grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
            return ;
        }
  
        char a=grid[i][j];
        grid[i][j]='0';
        dfs(grid,i-1,j);
          dfs(grid,i+1,j);
            dfs(grid,i,j-1);
              dfs(grid,i,j+1);
           
    }
}
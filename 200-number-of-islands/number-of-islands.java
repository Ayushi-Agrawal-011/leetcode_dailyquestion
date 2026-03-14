class Solution {
    public int numIslands(char[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        int c=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && !visited[i][j]){
                c++;
                dfs(grid,i,j,visited);

            }
        }
    }    
    return c;
    }
    public void dfs(char[][]grid,int i,int j, boolean[][]visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
            return ;
        }
        visited[i][j]=true;
        char a=grid[i][j];
        grid[i][j]='0';
        dfs(grid,i-1,j,visited);
          dfs(grid,i+1,j,visited);
            dfs(grid,i,j-1,visited);
              dfs(grid,i,j+1,visited);
              //grid[i][j]=a;
    }
}
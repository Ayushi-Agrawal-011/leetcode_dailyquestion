class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans = dfs(grid, i, j);
                    return ans;
                }
            }

        }
        return 0;
    }

    public int dfs(int[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == 0)
            return 1;
              if (grid[i][j] == 2)
            return 0;
        grid[i][j] = 2;
        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, -1, 1 };
        int ans = 0;
        for (int k = 0; k < 4; k++) {
            int nr = i + r[k];
            int nc = j + c[k];
           
                ans += dfs(grid, nr, nc);
               
            
        }
        //  grid[i][j]=1;
        return ans;
    }
}
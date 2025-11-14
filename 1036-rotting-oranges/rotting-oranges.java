class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int maxTime = 0;
        
        // Step 1: iterate over all cells
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){  // fresh orange
                    int time = dfs(grid, i, j, new boolean[rows][cols]);
                    if(time == Integer.MAX_VALUE) return -1; // can't rot
                    maxTime = Math.max(maxTime, time);
                }
            }
        }
        
        return maxTime;
    }
    
    // DFS returns minimum time for this orange to rot
    private int dfs(int[][] grid, int i, int j, boolean[][] visited){
        int rows = grid.length, cols = grid[0].length;
        if(i < 0 || j < 0 || i >= rows || j >= cols) return Integer.MAX_VALUE;
        if(grid[i][j] == 0) return Integer.MAX_VALUE; // empty
        if(grid[i][j] == 2) return 0; // already rotten
        
        if(visited[i][j]) return Integer.MAX_VALUE;
        visited[i][j] = true;
        
        int[] r = {-1, 1, 0, 0};
        int[] c = {0, 0, -1, 1};
        int minTime = Integer.MAX_VALUE;
        
        for(int k = 0; k < 4; k++){
            int ni = i + r[k], nj = j + c[k];
            int t = dfs(grid, ni, nj, visited);
            if(t != Integer.MAX_VALUE)
                minTime = Math.min(minTime, t + 1); // add 1 minute for this step
        }
        
        visited[i][j] = false;
        return minTime;
    }
}

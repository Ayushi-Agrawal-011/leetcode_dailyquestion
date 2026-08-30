class Solution {
    public int minimumOperations(int[][] grid) {
       
        int ans = 0;

        for(int j = 0; j < grid[0].length; j++) {
            
            for(int i = 1; i < grid.length; i++) {
                
                if(grid[i][j] <= grid[i-1][j]) {
                    int required = grid[i-1][j] + 1;
                    ans += required - grid[i][j];
                    grid[i][j] = required;
                }
            }
            }
        return ans;

    }
}
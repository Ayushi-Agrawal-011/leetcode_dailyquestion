class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        
       int m = grid.length;
        int n = grid[0].length;

        long total = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total += grid[i][j];
            }
        }

        long currSum = 0;

        // Horizontal cut
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                currSum += grid[i][j];
            }

            if (2 * currSum == total) {
                return true;
            }
        }

        currSum = 0;

        // Vertical cut
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                currSum += grid[i][j];
            }

            if (2 * currSum == total) {
                return true;
            }
        }

        return false;
    }
}
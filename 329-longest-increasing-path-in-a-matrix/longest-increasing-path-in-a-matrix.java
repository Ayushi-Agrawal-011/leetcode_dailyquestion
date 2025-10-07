class Solution {
    int m, n;
    
    public int longestIncreasingPath(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        int[][] dp = new int[m][n];  // memoization
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = Math.max(result, dfs(matrix, i, j, dp));
            }
        }

        return result;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] dp) {
        if (dp[i][j] != 0) return dp[i][j];  // already computed

        int max = 1; // At least the cell itself

        // Move Up
        if (i > 0 && matrix[i-1][j] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i-1, j, dp));
        }
        // Move Down
        if (i < m-1 && matrix[i+1][j] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i+1, j, dp));
        }
        // Move Left
        if (j > 0 && matrix[i][j-1] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i, j-1, dp));
        }
        // Move Right
        if (j < n-1 && matrix[i][j+1] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i, j+1, dp));
        }

        dp[i][j] = max; // store result
        return max;
    }
}

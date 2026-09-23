
class Solution {
    public boolean isPossibleToCutPath(int[][] grid) {

        if (!bfs(grid))
            return true;

        dfs(grid, 0, 0);

        grid[0][0] = 1;

        return !bfs(grid);
    }

    public boolean dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || j >= n || grid[i][j] == 0)
            return false;

        if (i == m - 1 && j == n - 1)
            return true;

        grid[i][j] = 0;

        if (dfs(grid, i + 1, j) || dfs(grid, i, j + 1))
            return true;

        grid[i][j] = 1;

        return false;
    }

    public boolean bfs(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][0] == 0 || grid[m - 1][n - 1] == 0)
            return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        q.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];

            if (i == m - 1 && j == n - 1)
                return true;

            if (i + 1 < m && grid[i + 1][j] == 1 &&
                !visited[i + 1][j]) {
                visited[i + 1][j] = true;
                q.add(new int[]{i + 1, j});
            }

            if (j + 1 < n && grid[i][j + 1] == 1 &&
                !visited[i][j + 1]) {
                visited[i][j + 1] = true;
                q.add(new int[]{i, j + 1});
            }
        }

        return false;
    }
}
class Solution {
      int[][][] dp;
    int m, n;
int k;
    public int maxPathScore(int[][] grid, int k) {
           m = grid.length;
        n = grid[0].length;
this.k = k;
        dp = new int[m][n][k + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -2);
            }
        }
        int ans = fn(grid,0,0,0);

        return ans == -1 ? -1 : ans;
    }
    public int fn(int[][]grid,int i,int j,int cost){
        if(i>=m || j>=n)
        return -1;
    //     if(cost > k)
    // return -1;
      
        int score=0;
        
        if(grid[i][j]==1){
      score++;
      cost++;
        }
       else if(grid[i][j]==2){
      score+=2;
      cost++;
        }
        if (cost > k)
            return  -1;

  if (dp[i][j][cost] != -2)
            return dp[i][j][cost];
          if (i == m - 1 && j == n - 1)
            return dp[i][j][cost] = score;
        int ans=Integer.MIN_VALUE;
        int a=fn(grid,i+1,j,cost);
        int b=fn(grid,i,j+1,cost);
        ans=Math.max(a,b);
           if (ans == -1) {
            return dp[i][j][cost] = -1;
        }

        return dp[i][j][cost] = score + ans;

    }
}
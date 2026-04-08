class Solution {
    public int countPathsWithXorValue(int[][] grid, int k) {
        
        int n = grid.length, m = grid[0].length;
       Map<Integer, Integer>[][] dp = new HashMap[n][m];
   
        return fn(grid,0,0,0,k,dp);
    }
    public int fn(int[][]grid,int i,int j,int xor,int k,  Map<Integer, Integer>[][] dp){
        if(i<0 || j<0 ||i>=grid.length || j>=grid[0].length){
             return 0;  
           }  
        xor^=grid[i][j];
        if(i==grid.length-1 && j==grid[0].length-1){
             return xor == k ? 1 : 0;
        }
           
       if (dp[i][j] != null && dp[i][j].containsKey(xor)) {
            return dp[i][j].get(xor);
        }
        int right=fn(grid,i,j+1,xor,k,dp);
        int down=fn(grid,i+1,j,xor,k,dp);
     

        
           int ans = (right + down) % 1000000007;

         if (dp[i][j] == null) {
            dp[i][j] = new HashMap<>();
        }

        dp[i][j].put(xor, ans);

        return ans;
        
    }
}
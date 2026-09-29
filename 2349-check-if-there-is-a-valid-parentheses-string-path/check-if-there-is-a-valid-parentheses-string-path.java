class Solution {
     Boolean[][][] dp;
    public boolean hasValidPath(char[][] grid) {
         dp = new Boolean[grid.length][grid[0].length]
                         [grid.length + grid[0].length + 1];
        return fn(grid,0,0,0);
    }
    public boolean fn(char[][]grid,int i,int j,int bal){
          if(i>=grid.length || j>=grid[0].length || i<0 || j<0 )
        return false;
        if(grid[i][j]=='(')
        bal++;
        else
        bal--;
         if (bal < 0)
            return false;
        if(i==grid.length-1 && j==grid[0].length-1){
           return bal==0;
        }
       if (dp[i][j][bal] != null)
            return dp[i][j][bal];

    
        boolean right=fn(grid,i+1,j,bal);
        boolean down=fn(grid,i,j+1,bal);
        return dp[i][j][bal]=right || down; 
    }
    
}
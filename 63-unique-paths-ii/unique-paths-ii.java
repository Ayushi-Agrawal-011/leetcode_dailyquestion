class Solution {
       int c=0;
    public int uniquePathsWithObstacles(int[][] grid) {
      if(grid[grid.length-1][grid[0].length-1]==1)
      return 0;
          int n = grid.length;
        int m =grid[0].length;

        int[][] dp = new int[n+1][m+1];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
       return path(grid,0,0,dp);
       

    }
    public  int path(int [][]grid,int cr,int cc,int[][]dp){
        if(cr==grid.length-1 && cc==grid[0].length-1){
            c++;
            return 1;
        }
          if(cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]==1  ){
        
            return 0 ;
        }
        if(dp[cr][cc]!=-1)
        return dp[cr][cc];
    
      
      int a=path(grid,cr+1,cc,dp);
      int b=path(grid,cr,cc+1,dp);
      return dp[cr][cc]= a+b;
    }

}
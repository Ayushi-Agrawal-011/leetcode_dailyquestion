class Solution {
    public int maxMoves(int[][] grid) {
        int ans=Integer.MIN_VALUE;
        int[][]dp=new int[grid.length][grid[0].length];
        for(int []ar:dp){
            Arrays.fill(ar,-1);
        }
             for(int i=0;i<grid.length;i++){
                 ans = Math.max(ans, p(grid, i, 0, dp));
        
     }   
     return ans;
    }
public int p(int [][] grid,int i,int j,int[][]dp){
    if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
    return Integer.MIN_VALUE;
    if(dp[i][j]!=-1)
    return dp[i][j];
 int rd=0,right=0,d=0;
    if((i-1)>=0 && (j+1)<grid[0].length && grid[i][j]<grid[i-1][j+1])
 rd=1+p(grid,i-1,j+1,dp);
  if((j+1)<grid[0].length &&grid[i][j]<grid[i][j+1])
 right=1+p(grid,i,j+1,dp);
 if((i+1)<grid.length &&(j+1)<grid[0].length && grid[i][j]<grid[i+1][j+1])
 d=1+p(grid,i+1,j+1,dp);
return dp[i][j]=Math.max(rd,Math.max(right,d));
}
}
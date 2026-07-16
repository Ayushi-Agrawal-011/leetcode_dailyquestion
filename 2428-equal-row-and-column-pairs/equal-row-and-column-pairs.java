class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fn(grid,i,j,n))
                c++;
            }
        }
        return c;
    }
    public boolean fn(int[][]grid,int r,int c,int n){
     int ans=0;
            for(int j=0;j<n;j++){
                if(grid[r][j]!=grid[j][c])
                return false;
            
        }
        return true;
    }
}
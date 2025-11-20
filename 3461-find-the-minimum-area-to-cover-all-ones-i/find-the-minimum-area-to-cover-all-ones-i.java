class Solution {
    public int minimumArea(int[][] grid) {
        int  minr=grid.length;
        int minc=grid[0].length;
        int maxr=0;
        int maxc=0;
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minr=Math.min(minr,i);
                    minc=Math.min(minc,j);
                    maxr=Math.max(maxr,i);
                    maxc=Math.max(maxc,j);
                }
            }
         }
        return (maxr-minr+1)*(maxc-minc+1);
    }
}
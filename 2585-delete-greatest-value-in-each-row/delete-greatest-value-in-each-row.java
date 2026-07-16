class Solution {
    public int deleteGreatestValue(int[][] grid) {
     for(int[]r:grid){
        Arrays.sort(r);
     }
     int sum=0;
     for(int j=grid[0].length-1;j>=0;j--){
        int ans=0;
        for(int i=0;i<grid.length;i++){
            ans=Math.max(ans,grid[i][j]);
        }
        sum+=ans;
     }
      return sum;  

    }
}
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
       int idx=y;
       for(int i=0;i<k;i++){
        int a=x;
        int b=x+k-1;
       while(a<b){
        int temp=grid[a][idx];
        grid[a][idx]=grid[b][idx];
        grid[b][idx]=temp;
        a++;
        b--;
       }
       idx++;
       }
       return grid;
    }
}
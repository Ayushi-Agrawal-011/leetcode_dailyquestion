class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>>ans=new ArrayList<>();
          int m=grid.length;
        int n=grid[0].length;
        for(int p=0;p<k;p++){
          
        int a=grid[m-1][n-1];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==0 && j==0)
                grid[i][j]=a;
               else  if(j==0)
                grid[i][j]=grid[i-1][n-1];
                else 
                grid[i][j]=grid[i][j-1];

            }

        }}
        for(int i=0;i<m;i++){
            List<Integer> ll=new ArrayList<>();
            for(int j=0;j<n;j++){
                ll.add(grid[i][j]);
            }
            ans.add(ll);
            }
        return ans;
    }
    

}
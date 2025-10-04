class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[n+1][m+1];
        for(int[] num : memo)
            Arrays.fill(num, -1);
       return solve(memo,n,m,0,0);
    }
 
    public int solve(int [][] memo,int n,int m,int i,int j){
        if(i>=n || j>=m)
        return 0;
        if(i==n-1 && j==m-1)
          return 1;
          if(memo[i][j]!=-1)
          return memo[i][j];
          memo[i][j]=solve(memo,n,m,i,j+1)+solve(memo,n,m,i+1,j);
          return memo[i][j];
    }
}
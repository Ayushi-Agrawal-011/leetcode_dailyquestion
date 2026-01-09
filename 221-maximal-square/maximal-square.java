class Solution {
     public int maxi = 0;
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
       int[][] dp=new int[m][n]; 
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        solve(matrix,0,0,dp);
        return maxi*maxi;
    }
    public int solve(char[][] matrix, int i, int j,int[][]dp) {
        if(i>=matrix.length || j>=matrix[0].length)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int right=solve(matrix,i,j+1,dp);
        int diagonal=solve(matrix,i+1,j+1,dp);
        int down=solve(matrix,i+1,j,dp);
        if(matrix[i][j]=='1'){
            dp[i][j]=1+Math.min(right,Math.min(down,diagonal));
            maxi=Math.max(maxi,dp[i][j]);
        }
        else
        dp[i][j]=0;
        return dp[i][j];


    }

}
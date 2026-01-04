class Solution {
    public int maxRepeating(String sequence, String word) {
      int n = sequence.length();
        int len = word.length();
        int[] dp = new int[n + 1]; 
        int max = 0;
        for (int i = len; i <= n; i++) {
            if (sequence.substring(i - len, i).equals(word)) {
                dp[i] = dp[i - len] + 1;  
                max = Math.max(max, dp[i]);
            }
        }

        return max;
        
    }
     public int fn(int[][]matrix,int[][]dp,int i,int j){
        if(i>=matrix.length || j>=matrix[0].length)
        return 0;
        if(matrix[i][j]==0)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int right=fn(matrix,dp,i,j+1);
        int diagonal=fn(matrix,dp,i+1,j+1);
        int bottom=fn(matrix,dp,i+1,j);
        return dp[i][j]=1+Math.min(diagonal,Math.min(right,bottom));
    }
}
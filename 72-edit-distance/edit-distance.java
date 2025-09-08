class Solution {
    public int minDistance(String s, String t) {
       return Min_Ops(s,t) ;
    }
    public static int Min_Ops(String s, String t){
    int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];

        // base case: convert empty suffixes
        for (int i = 0; i <= n; i++) dp[i][m] = n - i;  // delete rest of s
        for (int j = 0; j <= m; j++) dp[n][j] = m - j;  // insert rest of t

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];  // no operation needed
                } else {
                    int D = dp[i + 1][j];     // delete
                    int R = dp[i + 1][j + 1]; // replace
                    int I = dp[i][j + 1];     // insert
                    dp[i][j] = Math.min(D, Math.min(R, I)) + 1;
                }
            }
        }
        return dp[0][0];
    }
}
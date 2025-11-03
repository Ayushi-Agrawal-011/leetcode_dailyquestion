class Solution {
    public int minDistance(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return Min_Ops(s, t, 0, 0, dp);
    }

    public static int Min_Ops(String s, String t, int i, int j, int[][] dp) {
 if(i==s.length()){
    return t.length()-j;
 }
  if(j==t.length()){
    return s.length()-i;
 }
 if(dp[i][j]!=-1)
 return dp[i][j];
 if(s.charAt(i)==t.charAt(j)){
    return dp[i][j]=Min_Ops(s,t,i+1,j+1,dp);
 }
 else{
    int I=Min_Ops(s,t,i,j+1,dp);
    int D=Min_Ops(s,t,i+1,j,dp);
    int R=Min_Ops(s,t,i+1,j+1,dp);
      return dp[i][j] = Math.min(D, Math.min(R, I)) + 1;

 }
   
 




        
    }
}
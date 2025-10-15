class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
       int [][]dp=new int[s1.length()][s2.length()];
       for(int i = 0; i < dp.length; i++) {
    for(int j = 0; j < dp[0].length; j++) {
        dp[i][j] = -1;
    }
}
return so(s1,s2,0,0,dp);
    }
     public int so(String s, String t,int i,int j,int [][]dp) {
        if(i==s.length() || j==t.length()){
            return 0;
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=1+so(s,t,i+1,j+1,dp);
        }
        else{
            int a=so(s,t,i,j+1,dp);

            int b=so(s,t,i+1,j,dp);
            return dp[i][j]=Math.max(a,b);
        }
            }
}
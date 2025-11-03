class Solution {
    public int longestCommonSubsequence(String s, String t) {

	    int[][] dp = new int[s.length()][t.length()];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
		return (Coin_Change(s,t,0,0,dp));

    }
    	 public static int Coin_Change(String s, String t, int i, int j,int[][]dp) {

            if(i==s.length() || j==t.length()){
                return 0;
            }
            if(dp[i][j]!=-1)
            return dp[i][j];
            int ans=0;
            if(s.charAt(i)==t.charAt(j)){
              ans=1+Coin_Change(s,t,i+1,j+1,dp);
            }
            else{
                int fs=Coin_Change(s,t,i+1,j,dp);
                               int rs=Coin_Change(s,t,i,j+1,dp);
ans=Math.max(fs,rs);
            }
            dp[i][j]=ans;
            return dp[i][j];
         }}
 
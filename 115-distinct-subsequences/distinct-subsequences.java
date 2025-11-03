class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
      return Coin_Change(s,t,0,0,dp);
    }
    public static int Coin_Change(String s, String t, int i, int j,int[][]dp) {
        if(j==t.length())
        return 1;
		if(i==s.length())
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int pick=0,dopick=0;
        if(s.charAt(i)==t.charAt(j)){
        pick=Coin_Change(s,t,i+1,j+1,dp);
        }
        dopick=Coin_Change(s,t,i+1,j,dp);
        return dp[i][j]= pick+dopick;
       


    }
}
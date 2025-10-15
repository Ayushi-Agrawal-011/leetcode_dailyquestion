class Solution {
    public int maxUncrossedLines(int[] s1, int[] s2) {
        int [][]dp=new int[s1.length][s2.length];
       for(int i = 0; i < dp.length; i++) {
    for(int j = 0; j < dp[0].length; j++) {
        dp[i][j] = -1;
    }
}
return s(s1,s2,0,0,dp);
    }
    public int s(int []s1, int [] s2,int i,int j,int [][]dp) {
        if(i==s1.length || j==s2.length)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int ans=0;
      if(s1[i]==s2[j]) {
   ans=1+s(s1,s2,i+1,j+1,dp);
      }
      else{
        int f=s(s1,s2,i+1,j,dp);
          int t=s(s1,s2,i,j+1,dp);
          ans=Math.max(f,t);
      }
      return dp[i][j]=ans;
    }

}
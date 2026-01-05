class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
           if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return fn(s1, s2, s3, dp,0,0);
    }
    public boolean fn(String s1,String s2,String s3 ,int[][] dp,int i,int j){
        if(j+i==s3.length())
        return true;
        if(dp[i][j]!=-1)
        return dp[i][j]==1;
        boolean ans=false;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j))
        ans|=fn(s1,s2,s3,dp,i+1,j);
         if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j))
        ans|=fn(s1,s2,s3,dp,i,j+1);
        dp[i][j]=ans?1:0;
        return ans;
    }
}
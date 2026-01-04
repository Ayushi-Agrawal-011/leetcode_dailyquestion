class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][]dp=new int[n][m];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
return fn(text1,text2,dp,0,0);
    }
    public int fn(String text1,String text2,int[][]dp,int i,int j){
        if(i==text1.length()|| j==text2.length())
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j))
        return dp[i][j]=1+fn(text1,text2,dp,i+1,j+1);
        else{
            int fs=fn(text1,text2,dp,i+1,j);
            int ss=fn(text1,text2,dp,i,j+1);
            dp[i][j]=   Math.max(fs,ss);
        }
        return dp[i][j];
    }
}
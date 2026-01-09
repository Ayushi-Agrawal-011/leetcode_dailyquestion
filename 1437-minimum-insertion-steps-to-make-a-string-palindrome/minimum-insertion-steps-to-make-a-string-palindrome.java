class Solution {
    public int minInsertions(String s) {
       String t=new StringBuilder(s).reverse().toString();
       int[][]dp=new int[s.length()][s.length()];
       for(int[]ar:dp){
        Arrays.fill(ar,-1);
       } 
       return s.length()-fn(s,t,0,0,dp);
    }
    public int fn(String s,String t,int i,int j,int[][]dp){
        if(i>=s.length() || j>=t.length())
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
        return dp[i][j]=1+fn(s,t,i+1,j+1,dp);
        int fs=fn(s,t,i+1,j,dp);
        int ss=fn(s,t,i,j+1,dp);
        return dp[i][j]= Math.max(fs,ss);
    }
}
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
          int[][]dp=new int[text1.length()][text2.length()];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
return fn(text1,text2,0,0,dp);
    }
     public int fn(String s,String t,int i,int j,int[][]dp){
        if( i>=s.length() || j>=t.length())
        return 0;
      
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
return  dp[i][j]=1+fn(s,t,i+1,j+1,dp);
        }
        else{
        int a=fn(s,t,i,j+1,dp);
        int b=fn(s,t,i+1,j,dp);
       
        return dp[i][j]=Math.max(a,b);
        }
    }
}
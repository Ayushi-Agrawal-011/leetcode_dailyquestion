class Solution {
    public int minDistance(String word1, String word2) {
        int[][]dp=new int[word1.length()][word2.length()];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fn(word1,word2,0,0,dp);
    }
    public int fn(String s,String t,int i,int j,int[][]dp){
         if(j==t.length())
        return s.length()-i;
        if(i==s.length())
        return t.length()-j;
       
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=fn(s,t,i+1,j+1,dp);
        }
        else{
            int a=fn(s,t,i,j+1,dp);
            int b=fn(s,t,i+1,j,dp);
            int c=fn(s,t,i+1,j+1,dp);
            return dp[i][j]=1+Math.min(a,Math.min(b,c));
        }
        //return dp[i][j];
    }
}
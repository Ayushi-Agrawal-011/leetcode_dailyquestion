class Solution {
    public int minDistance(String word1, String word2) {
        int[][]dp=new int[word1.length()][word2.length()];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fn(word1,word2,0,0,dp);
    }
    public int fn(String s,String t,int i,int j,int[][]dp){
        if(t.length()==j)
        return s.length()-i;
        if(s.length()==i)
        return t.length()-j;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return fn(s,t,i+1,j+1,dp);
        }
        else{
            int I=fn(s,t,i+1,j,dp);
            int D=fn(s,t,i,j+1,dp);
            int R=fn(s,t,i+1,j+1,dp);
            return dp[i][j]=Math.min(I,Math.min(D,R))+1;
        }
        
    }
}
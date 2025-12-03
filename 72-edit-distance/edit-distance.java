class Solution {
    public int minDistance(String s, String t) {
    int n=s.length();
    int m=t.length();
    int[][]dp=new int[n][m];
    for(int[]row:dp){
        Arrays.fill(row,-1);
    }
return r(s,t,0,0,dp);
    }
public int r(String s,String t,int i,int j,int[][]dp){
    if(i==s.length()){
        return t.length()-j;
    }
    if(j==t.length()){
        return s.length()-i;
    }
    if(dp[i][j]!=-1)
    return dp[i][j];
    if(s.charAt(i)==t.charAt(j)){
        return dp[i][j]=r(s,t,i+1,j+1,dp);
    }
    else{
        int D=r(s,t,i,j+1,dp);
        int I =r(s,t,i+1,j,dp);
         int  R=r(s,t,i+1,j+1,dp);
         return dp[i][j]=Math.min(D,Math.min(I,R))+1;
    }
  
}
}
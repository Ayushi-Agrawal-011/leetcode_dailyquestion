class Solution {
    public int maxUncrossedLines(int[] s1, int[] s2) {
          int [][]dp=new int[s1.length][s2.length];
	     for(int []a:dp) {
	    	 Arrays.fill(a, -1);
	}
	return( r(s1,s2,0,0,dp));
    }
  
     public int r(int[]s,int[] t,int i,int j,int[][]dp){
    if(i==s.length ||j==t.length){
        return 0;
    }
   
    if(dp[i][j]!=-1)
    return dp[i][j];
    if(s[i]==t[j]){
        return dp[i][j]=1+r(s,t,i+1,j+1,dp);
    }
    else{
        int D=r(s,t,i,j+1,dp);
        int I =r(s,t,i+1,j,dp);
         
         return dp[i][j]=Math.max(D,I);
    }
  
}
}
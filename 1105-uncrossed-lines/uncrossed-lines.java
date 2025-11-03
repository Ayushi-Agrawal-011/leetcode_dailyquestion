class Solution {
    public int maxUncrossedLines(int[] s1, int[] s2) {
          int [][]dp=new int[s1.length][s2.length];
	     for(int []a:dp) {
	    	 Arrays.fill(a, -1);
	}
	return( so(s1,s2,0,0,dp));
    }
    public static int so(int[]s1, int[] s2,int i,int j,int [][]dp) {
        if(i==s1.length || j==s2.length)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int ans=0;
      if(s1[i]==s2[j]) {
   ans=1+so(s1,s2,i+1,j+1,dp);// if matches dono ka pointer match kro
      }
      else{
        int f=so(s1,s2,i+1,j,dp);//ek baar pehle string ka pointer bdhao
          int t=so(s1,s2,i,j+1,dp);//ek baar dusri string ka pointer bdhao
          ans=Math.max(f,t);//dono ka max lo
      }
      return dp[i][j]=ans;
     
    }
}
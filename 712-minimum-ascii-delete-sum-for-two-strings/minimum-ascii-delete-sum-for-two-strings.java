class Solution {
    int c=0;
    public int minimumDeleteSum(String s, String t) {
          int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int k=Min_Ops(s, t, 0, 0, dp);
        return k; 
    }

 

    public static int Min_Ops(String s, String t, int i, int j, int[][] dp) {
  if(i==s.length()){
     int sum = 0;
            for (int k = j; k < t.length(); k++) sum += t.charAt(k);
            return sum;
  }
   else if(j==t.length()){
 int sum = 0;
            for (int k = i; k <s.length(); k++) sum += s.charAt(k);
            return sum;
   }
   if(dp[i][j]!=-1)
   return dp[i][j];
   if(s.charAt(i)==t.charAt(j)){
    return  dp[i][j]=Min_Ops(s,t,i+1,j+1,dp);
   }
   else{
int D=s.charAt(i)+Min_Ops(s,t,i+1,j,dp);
int I=t.charAt(j)+Min_Ops(s,t,i,j+1,dp);

 return  dp[i][j]=Math.min(D,I);
   }
 




        
    }
}
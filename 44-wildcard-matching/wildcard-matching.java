class Solution {
    public boolean isMatch(String s, String p) {
      int[][]dp=new int[s.length()+1][p.length()+1];
       for(int[]ar:dp){
        Arrays.fill(ar,-1);
       }    
       return fn(s,p,0,0,dp);
    }
      public boolean fn(String s,String p,int i,int j,int[][]dp){
        if(dp[i][j]!=-1)
        return dp[i][j]==1;
        boolean ans;
        if(j==p.length())
        return i==s.length();
       else if(i==s.length()){
     ans=true;
     for(int k=j;k<p.length();k++){
        if(p.charAt(k)!='*'){
            ans=false;
            break;
        }

     }
        }
       else{
        if(p.charAt(j)=='*'){
            ans=fn(s,p,i+1,j,dp) || fn(s,p,i,j+1,dp);
        }
        else if(p.charAt(j)=='?' || p.charAt(j)==s.charAt(i))
        ans=fn(s,p,i+1,j+1,dp);
        else
        ans=false;
       }
       dp[i][j]=ans?1:0;
       return ans;
      }
}
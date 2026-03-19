class Solution {
    public boolean wordBreak(String s, List<String> ll) {
       Boolean[] dp=new Boolean[s.length()];
      return fn(s,ll,0,dp);
    }
    public boolean fn(String s,List<String> ll,int si,Boolean[]dp){
           if(s.length()==si)
        return true;
       if(dp[si]!=null)
       return dp[si];
       for(int i=si+1;i<=s.length();i++){
        String p=s.substring(si,i);
        if(ll.contains(p)){
            boolean ans=fn(s,ll,i,dp);
            if(ans)
            return dp[si]=true;


        }
       } 
       return dp[si]=false;
    }

}
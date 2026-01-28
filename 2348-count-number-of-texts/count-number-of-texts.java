class Solution {
   
    public int countTexts(String pressedKeys) {
          int mod = 1000000007;
        int n = pressedKeys.length();
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);
        return fn(pressedKeys, 0, dp);
      
    }
     public int fn(String s,int i,int[]dp) {
          int mod = 1000000007;
if(i>=s.length())
return 1;
if(dp[i]!=-1)
return dp[i];
int ways=3;
if(s.charAt(i)=='7'|| s.charAt(i)=='9')
ways=4;
int ans=0;
for(int j=0;j<ways;j++ ){
if(i+j<s.length() && s.charAt(i)==s.charAt(i+j)){
    ans+=fn(s,i+j+1,dp);
    ans=ans%mod;
}
else 
break;
}    
return dp[i]=ans;  
    }
}
class Solution {
    public int minExtraChar(String s, String[] wordDict) {
       Set<String> wordSet = new HashSet<>(Arrays.asList(wordDict));
 int n=s.length();
 int[] dp=new int[n+1];

 dp[0]=0;
 for(int i=1;i<=n;i++){
    dp[i]=dp[i-1]+1;
    for(int j=0;j<i;j++){
    
        if( wordSet.contains(s.substring(j,i))){
            dp[i]=Math.min(dp[i],dp[j]);
      
        }
    }
 }
 return dp[n];
    }
}
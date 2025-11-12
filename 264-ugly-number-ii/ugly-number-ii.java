class Solution {
    public int nthUglyNumber(int n) {
       int p=0,q=0,r=0;
       int[]dp=new int[n+1];
       dp[0]=1;
       for(int i=1;i<=n;i++){
        dp[i]=Math.min(2*dp[p],Math.min(3*dp[q],5*dp[r]));
        if(dp[p]*2==dp[i])
        p++;
         if(dp[q]*3==dp[i])
        q++;
         if(dp[r]*5==dp[i])
        r++;
       }
       return dp[n-1];
    }
     
}
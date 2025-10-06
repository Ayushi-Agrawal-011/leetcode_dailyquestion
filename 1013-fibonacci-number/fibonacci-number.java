class Solution {
    public int fib(int n) {
 int [] dp=new int[n+1];
Arrays.fill(dp,-1);
 return fibdp(n,dp);
    }

public int fibdp(int  n,int []dp){
if(n==0 || n==1){

    return n;
}
if(dp[n]!=-1)
return dp[n];
int a=fibdp(n-1,dp);
int b=fibdp(n-2,dp);
return dp[n]=a+b;
}
}
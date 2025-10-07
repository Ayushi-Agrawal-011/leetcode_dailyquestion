class Solution {
    public int[] countBits(int n) {

 int [] nums=new int[n+1];
 int []dp=new int[n+1];
 Arrays.fill(dp,-1);
 for(int i=0;i<=n;i++){
    nums[i]=cb(i,dp);
 }
 return nums;
    }
    public int cb(int n,int []dp){
        if(n==0)
return 0;
if(dp[n]!=-1)
return dp[n];
return dp[n]=(n&1)+cb( n>>1,dp);
    }

}
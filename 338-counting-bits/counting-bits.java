class Solution {
    public int[] countBits(int n) {

 int [] nums=new int[n+1];
 int []dp=new int[n+1];
 Arrays.fill(dp,-1);
dp[0]=0;
if(n==0)
return dp;
dp[1]=1;
for(int i=2;i<dp.length;i++){
    dp[i]=(i&1) +dp[i>>1];
}
 return dp;
    }
    

}
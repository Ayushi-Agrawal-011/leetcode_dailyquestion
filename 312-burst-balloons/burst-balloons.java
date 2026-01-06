class Solution {
    public int maxCoins(int[] arr) {
        int n=arr.length;
        int[]a=new int[n+2];
        a[0]=a[n+1]=1;
        for(int i=0;i<n;i++){
            a[i+1]=arr[i];
        }
        int[][]dp=new int[a.length][a.length];
        return Burst_Coin(a,0,a.length-1,dp);
            }

    public static int Burst_Coin(int[]a,int i,int j,int[][]dp) {
	if(i+1==j)
    return 0;
    if(dp[i][j]!=0)
    return dp[i][j];
    int ans=Integer.MIN_VALUE;
    for(int k=i+1;k<j;k++){
        int p=Burst_Coin(a,i,k,dp);
       int q=Burst_Coin(a,k,j,dp);
       int s=a[i]*a[j]*a[k];
  ans=Math.max(ans,p+q+s);
    }
   return  dp[i][j]=ans;
}
}
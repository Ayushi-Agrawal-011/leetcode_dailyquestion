class Solution {
    public int maxCoins(int[] arr) {
        int n=arr.length;
        int[]a=new int[n+2];
        a[0]=a[n+1]=1;
        for(int i=1;i<n+1;i++){
            a[i]=arr[i-1];
        }
        int[][]dp=new int[a.length][a.length];
    
        return fn(a,0,a.length-1,dp);
    }
    public int fn(int[]arr,int i,int j,int[][]dp){
        if(i+1==j)
        return 0;
        if(dp[i][j]!=0)
        return dp[i][j];
        int ans=Integer.MIN_VALUE;
        for(int k=i+1;k<j;k++){
            int a=fn(arr,i,k,dp);
            int b=fn(arr,k,j,dp);
            int c=arr[i]*arr[j]*arr[k];
            ans=Math.max(a+b+c,ans);
        }
        return dp[i][j]=ans;
    }
}
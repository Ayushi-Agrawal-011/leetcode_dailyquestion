class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
         int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return fn(arr, k, 0, dp);
     
    }
    public int fn(int[]arr,int k,int i,int[]dp){
        if(i>=arr.length)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int maxsum=0,maxpartition=0;
        for(int j=1;j<=k && i+j<=arr.length;j++){
            maxpartition=Math.max(maxpartition,arr[i+j-1]);
            int sum=maxpartition*j+fn(arr,k,i+j,dp);
   maxsum=Math.max(maxsum,sum);
        }
        return dp[i]=maxsum;
    }
}
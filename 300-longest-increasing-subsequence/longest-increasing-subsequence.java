class Solution {
    public int lengthOfLIS(int[] arr) {
    int []dp=new int[arr.length];
    Arrays.fill(dp,1);
    int ans=0;
    for(int i=1;i<arr.length;i++){
        for(int j=i-1;j>=0;j--){
            if(arr[i]>arr[j]){
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        ans=Math.max(ans,dp[i]);
    }
    return Arrays.stream(dp).max().getAsInt();
    }
}
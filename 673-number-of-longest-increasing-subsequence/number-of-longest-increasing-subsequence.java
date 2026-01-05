class Solution {
    public int findNumberOfLIS(int[] arr) {
  int[]dp=new int[arr.length];
  int[]c=new int[arr.length];
Arrays.fill(dp,1);
Arrays.fill(c,1);
for(int i=0;i<arr.length;i++){
    for(int j=0;j<i;j++){
        if(arr[i]>arr[j]){
      if(dp[j]+1>dp[i]){
        dp[i]=dp[j]+1;
        c[i]=c[j];
      }
      else if(dp[j]+1==dp[i])
      c[i]+=c[j];
        }
    }
}
int ans=0;
    	int max= Arrays.stream(dp).max().getAsInt();
        for(int i=0;i<arr.length;i++){
            if(max==dp[i])
            ans+=c[i];
        }
        return ans;
            }
}
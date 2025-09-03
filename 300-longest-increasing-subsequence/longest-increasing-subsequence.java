class Solution {
    public int lengthOfLIS(int[] arr) {
        int []dp=new int[arr.length];
	Arrays.fill(dp,1);
	int ans=0;
	for(int i=1;i<dp.length;i++) {
		for(int j=i-1;j>=0;j--) {
			if(arr[i]>arr[j]) {
				int x=dp[j];
				dp[i]=Math.max(x+1,dp[i]);
			}
		}
	
	}
	return Arrays.stream(dp).max().getAsInt();
    }
}
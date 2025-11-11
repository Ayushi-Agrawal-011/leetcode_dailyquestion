import java.util.*;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        if (n == 0) return 0;

        // Sort by width asc, height desc if same width
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });
         int dp[][] = new int[envelopes.length][2];
         dp[0]=envelopes[0];
         int len=1;
		for(int i=1;i<dp.length;i++) {
			if(envelopes[i][1]>dp[len-1][1]) {
				dp[len]=envelopes[i];
				len++;
			}
			else {
				int idx=BinarySearch(dp,envelopes[i],0,len-1);
				dp[idx]=envelopes[i]; // DP[I] KO REPLACE WITH SMALLEST VALUE OF SUBSEQUENCE
			}
		}
		return len;

     
    }
    	public static int BinarySearch(int[][]dp,int[]nums,int si,int ei) {
		int idx=0; // SMALLEST VALUE OF SUBSEQUENCE KA INDEX RETURN KREGA
		while(si<=ei) {
			int mid=(si+ei)/2;
			if(nums[1]<=dp[mid][1]) {
				idx=mid;
				ei=mid-1;
			}
			else {
				si=mid+1;
			}
		}
		return idx;
	}
}

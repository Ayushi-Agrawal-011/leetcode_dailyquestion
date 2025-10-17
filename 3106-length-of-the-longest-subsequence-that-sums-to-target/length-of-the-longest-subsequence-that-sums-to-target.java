class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[target + 1][nums.size()+1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
      
        int ans = Coin_Change(nums, target, 0, dp);
        return ans < 0 ? -1 : ans; // if no valid subsequence found
    }
     public static int Coin_Change(List<Integer> nums,int amount,int i,int[][]dp) {
	if(amount==0)
    return 0;
     if(i==nums.size() || amount<0)
    return Integer.MIN_VALUE;
    if(dp[amount][i]!=-1)
    return dp[amount][i];
    int inc=Integer.MIN_VALUE,exc=Integer.MIN_VALUE;
    if(amount>=nums.get(i))
     inc=1+Coin_Change(nums,amount-nums.get(i),i+1,dp);
     exc=Coin_Change(nums,amount,i+1,dp);
    return dp[amount][i]= Math.max(inc,exc);
    }
}
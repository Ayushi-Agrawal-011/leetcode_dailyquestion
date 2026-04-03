class Solution {
    public int maximumScore(int[] nums, int[]arr) {
        int[][]dp=new int[arr.length][arr.length];
        for(int[]ar:dp){
            Arrays.fill(ar,0);
        }

        return fn(nums,arr,0,nums.length-1,0,dp);
    }
    public int fn(int[]nums,int []arr,int si,int ei,int i,int[][]dp){
        if(i>=arr.length)
        return 0;
        if(dp[si][i]!=0)
        return dp[si][i];
      return   dp[si][i]=Math.max(nums[si]*arr[i]+fn(nums,arr,si+1,ei,i+1,dp),
        nums[ei]*arr[i]+fn(nums,arr,si,ei-1,i+1,dp));
        
    }
}
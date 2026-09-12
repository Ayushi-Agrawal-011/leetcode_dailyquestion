class Solution {
    public int minRemovals(int[] nums, int target) {
       
        int[][] dp = new int[nums.length][16394];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        int ans = fn(nums,0,target,dp,0);

        return ans == 1000000 ? -1 : ans;
    }
    public int fn(int[]arr,int i,int target,int[][]dp,int xor){
       
        if(i==arr.length){
         if(xor==target){
            return 0;
        }
            return 1000000;
        }
        if(dp[i][xor]!=-1)
            return dp[i][xor];
        int take=fn(arr,i+1,target,dp,xor^arr[i]);
        int skip=1+fn(arr,i+1,target,dp,xor);
        return dp[i][xor]=Math.min(take,skip);
    }
}

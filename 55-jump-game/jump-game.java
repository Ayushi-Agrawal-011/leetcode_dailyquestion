class Solution {
    public boolean canJump(int[] nums) {
         Boolean[] dp = new Boolean[nums.length];
      return fn(nums,0,dp);
        
    }
    public boolean fn(int[]nums,int i,Boolean[]dp){

if(i>=nums.length)
return false;
if(i==nums.length-1)
return true;
if (dp[i] != null) return dp[i];
 for (int jump = 1; jump <= nums[i]; jump++) {
        if (fn(nums, i + jump,dp)) 
        return dp[i] = true;
    }
     return dp[i] = false;

    }
}
class Solution {
    int ans=Integer.MAX_VALUE;
    public int jump(int[] nums) {
        
      Integer[] dp = new Integer[nums.length];
      Boolean[] dp2 = new Boolean[nums.length];
      fn(nums,0,dp,dp2);
      return dp[0];
        
    }
    public boolean fn(int[]nums,int i,Integer[]dp, Boolean[] dp2){

if(i>=nums.length){
   
return false;
}
if(i==nums.length-1){
     dp[i]=0;
return dp2[i]=true;
}
int min=Integer.MAX_VALUE;
boolean can =false;
if (dp2[i] != null) return dp2[i];
 for (int j = 1; j <= nums[i]; j++) {
        if (fn(nums, i + j,dp,dp2)) {
            min=Math.min(min,dp[i+j]+1);
            can=true;
        }

    }
     if (can) {
            dp[i] = min;
            return dp2[i] = true;
        } else {
            return dp2[i] = false;
        }
     

    }
}
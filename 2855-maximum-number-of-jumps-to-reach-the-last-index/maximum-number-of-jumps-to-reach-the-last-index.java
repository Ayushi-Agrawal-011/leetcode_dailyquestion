class Solution {
    public int maximumJumps(int[] nums, int target) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,-2);
        int k=fn(nums,target,0,dp);
      return k==Integer.MIN_VALUE?-1:k;  
    }
    public int fn(int[]nums,int target,int i,int[]dp){
        if(i>=nums.length){
return Integer.MIN_VALUE;
        }
       
if(i==nums.length-1){
    return 0;
}
 if(dp[i]!=-2)
        return dp[i];
int ans=Integer.MIN_VALUE;
for(int j=i+1;j<nums.length;j++){
if(Math.abs(nums[j]-nums[i])<=target){
   int next = fn(nums, target, j,dp);

                if (next != Integer.MIN_VALUE) {
                    ans = Math.max(ans, 1 + next);
                }
}

}
return dp[i]=ans;
    }
}
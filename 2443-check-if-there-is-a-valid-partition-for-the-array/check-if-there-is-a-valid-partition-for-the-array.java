class Solution {
    public boolean validPartition(int[] nums) {
        Boolean[]dp=new Boolean[nums.length];
        return fn(nums,0,dp);
    }
    public  boolean fn(int[]nums,int i,Boolean []dp){
        if(i>=nums.length)
        return true;
        if(dp[i]!=null)
        return dp[i];
        boolean ans=false;
        if(i+1<nums.length){
           if(nums[i]==nums[i+1]) 
           ans|=fn(nums,i+2,dp);
        }
        if(i+2<nums.length){
            if(nums[i]==nums[i+1] && nums[i]==nums[i+2])
            ans|=fn(nums,i+3,dp);
            if(nums[i]==nums[i+1]-1 && nums[i]==nums[i+2]-2)
            ans|=fn(nums,i+3,dp);
        }
        return dp[i]=ans;
    }
}
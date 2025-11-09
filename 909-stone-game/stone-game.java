class Solution {
  public boolean stoneGame(int[] nums) {
       long[] dp=new long[nums.length];
    Arrays.fill(dp, -1);
       
  return    fn(nums,0,nums.length-1,dp)>=0;

    }
    public static long fn(int[] nums,int i,int j,long[]dp){
if(i>=nums.length || i<=0)
return 0;
if(dp[i]!=-1)
return dp[i];
long inc=nums[i]+fn(nums,i+1,j,dp);
long exc=nums[j]+fn(nums,i,j-1,dp);

return dp[i]=Math.max(inc,exc);
    }
}
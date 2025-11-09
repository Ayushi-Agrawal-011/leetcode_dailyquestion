class Solution {
    public long maxScore(int[] nums, int x) {
       long[][]dp=new long[nums.length][2];
    for (long[] row : dp) Arrays.fill(row, -1);
       int p=nums[0]%2;
  return    nums[0]+ fn(nums,1,dp,x,p);

    }
    public static long fn(int[] nums,int i,long[][]dp,int x,int p){
if(i>=nums.length)
return 0;
if(dp[i][p]!=-1)
return dp[i][p];
long exc=fn(nums,i+1,dp,x,p);
long inc=0;
if(nums[i]%2==p)
 inc=nums[i]+fn(nums,i+1,dp,x,p);
else
inc=nums[i]-x+fn(nums,i+1,dp,x,nums[i]%2);

return dp[i][p]=Math.max(inc,exc);
    }

}
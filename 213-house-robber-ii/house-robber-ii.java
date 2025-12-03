
class Solution {
    public int rob(int[] nums) {
       int[]dp=new int[nums.length];
       int n=nums.length;
        if (n == 0) return 0;          // No houses
        if (n == 1) return nums[0];
        Arrays.fill(dp,-1);
int a= r(nums,0,nums.length-2,dp);
Arrays.fill(dp,-1);
int b=r(nums,1,nums.length-1,dp);
return Math.max(a,b);


    }

    private int r(int[] nums, int i,int j,int[]dp) {

        if(i>j)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int rob=nums[i]+r(nums,i+2,j,dp);
        int dorob=r(nums,i+1,j,dp);
        return dp[i]= Math.max(rob,dorob);
    }
    
    
    }
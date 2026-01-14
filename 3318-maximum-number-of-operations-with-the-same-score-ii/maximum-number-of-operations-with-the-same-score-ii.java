class Solution {
    public int maxOperations(int[] nums) {
        int n=nums.length;
        int[][]dp=new int[n][n];
        for(int[]ar:dp){
            Arrays.fill (ar,-1);
        }
        return fn(0,n-1,0,nums,n,dp);
    }
    public int fn(int si,int ei,int prev,int[]nums,int n,int[][]dp){
        if(si>=n || ei<=0 || si>=ei)
        return 0;
        if(dp[si][ei]!=-1)
        return dp[si][ei];
        int fl=0,f=0,l=0;
        int s1=nums[si]+nums[si+1];
        int s2=nums[si]+nums[ei];
        int s3=nums[ei]+nums[ei-1];
        if(prev==0 || s1==prev)
        f=1+fn(si+2,ei,s1,nums,n,dp);
        if(prev==0 || s2==prev)
        fl=1+fn(si+1,ei-1,s2,nums,n,dp);
        if(prev==0 || s3==prev)
        l=1+fn(si,ei-2,s3,nums,n,dp);
        return dp[si][ei]=Math.max(f,Math.max(fl,l));
    }
}

class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        int m=mat.length;
        int n=mat[0].length;
        int[][]dp=new int[m][4901];
        for(int []ar:dp ){
            Arrays.fill(ar,-1);
        }
    return fn(mat,target,0,0,dp);
       
       
    }
    public int fn(int[][]mat,int target,int i,int sum,int[][]dp){
        if(i==mat.length )
        return Math.abs(sum-target);
        if(dp[i][sum]!=-1)
        return dp[i][sum];
        int ans=Integer.MAX_VALUE;
            for(int j=0;j<mat[0].length;j++){
                ans=Math.min(ans,fn(mat,target,i+1,sum+mat[i][j],dp));
            }
            return dp[i][sum]=ans;
    }
}
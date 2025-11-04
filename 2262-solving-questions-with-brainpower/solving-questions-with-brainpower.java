class Solution {
    public long mostPoints(int[][] questions) {  long[]dp=new long[questions.length];
    Arrays.fill(dp,-1);
        long ans=Long.MIN_VALUE;
        for(int i=0;i<questions.length;i++){
            ans=Math.max(ans,fn(questions,i,dp));
        }
        return ans;
    }
    public long fn(int [][]questions,int i,long[]dp){
        if(i>=questions.length){
            return 0;
        }
        if(dp[i]!=-1)
        return dp[i];
        long a=questions[i][0];
        int b=questions[i][1];
        long solve=a+fn(questions,i+b+1,dp);
        long skip=fn(questions,i+1,dp);
        return dp[i]= Math.max(solve,skip);
    }
}
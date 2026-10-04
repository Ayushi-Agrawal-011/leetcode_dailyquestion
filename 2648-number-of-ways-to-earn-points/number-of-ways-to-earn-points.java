class Solution {
    public int waysToReachTarget(int target, int[][] types) {
   int[][]dp=new int[types.length][target+1];
   for(int[]ar:dp){
    Arrays.fill(ar,-1);
   }   
   return fn(types,0,target,dp);  
    }
    public int fn(int[][]arr,int i,int target,int[][]dp){
           if(target==0)
        return 1;
        if(i>=arr.length)
        return 0;
     
        if(dp[i][target]!=-1)
        return dp[i][target];
        long ans=0;
        for(int k=0;k<=arr[i][0];k++){
            if(target - k * arr[i][1] >= 0) {
             ans = (ans + fn(arr, i + 1,
                        target - k * arr[i][1], dp)) % 1000000007;
            }
        }
        return dp[i][target]=(int)ans;
    }
}
class Solution {
    public int countRoutes(int[] locations, int start, int finish, int fuel) {  int n=locations.length;
        int[][]dp=new int[n][fuel+1];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fn(locations,start,finish,fuel,dp);
        
    }
    public int fn(int[]arr,int i,int finish,int fuel,int[][]dp){
        if(i>=arr.length || fuel<0)
        return 0;
    
        if(dp[i][fuel]!=-1)
        return dp[i][fuel];
        long ans=0;
        if(i==finish)
        ans=1;
        for(int k=0;k<arr.length;k++  ){
            if(k==i)
            continue;
           ans = (ans + fn(arr, k, finish,
            fuel - Math.abs(arr[i] - arr[k]), dp)) % 1000000007;
        }
        return dp[i][fuel]=(int)ans;
    }
}
class Solution {
    public long maxTaxiEarnings(int n, int[][] arr) {
       Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        long[]dp=new long[arr.length];

        Arrays.fill(dp,-1);
        return fn(arr,0,dp);
    }
    public long fn(int[] []arr,int i,long[]dp){
if(i>=arr.length)
return 0;
if(dp[i]!=-1)
return dp[i];
int j=i+1;
while(j<arr.length && arr[j][0]<arr[i][1])
j++;
    long pick=arr[i][1]-arr[i][0]+arr[i][2]+fn(arr,j,dp);
    long dopick=fn(arr,i+1,dp);
    dp[i]=Math.max(pick,dopick);


return dp[i];
    }
}
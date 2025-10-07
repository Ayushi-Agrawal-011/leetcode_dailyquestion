class Solution {
    public int rob(int[] arr) {
        int [] dp=new int[arr.length];
        int n=arr.length;
         if (n == 0) return 0;          // No houses
        if (n == 1) return arr[0];
  dp[0]=arr[0];
  dp[1]=Math.max(arr[0],arr[1]);
  for(int i=2;i<dp.length;i++){
    int left=arr[i]+dp[i-2];
    int right=dp[i-1];
    dp[i]=Math.max(left,right);
  }
return dp[arr.length-1];
    }
 
}
class Solution {
    public int maxCoins(int[] nums) {
      int n = nums.length;

        int[] a = new int[n + 2];
        a[0] = 1;
        a[n + 1] = 1;
      for(int i=0;i<nums.length;i++){
        a[i+1]=nums[i];
      }
       int[][]dp=new int[a.length][a.length]; 
       return fn(a,0,a.length-1,dp);
    }
    public int fn(int[]a,int i,int j,int[][]dp){

if(i+1==j)
return 0;
if(dp[i][j]!=0)
return dp[i][j];
int ans=Integer.MIN_VALUE;
for(int k=i+1;k<j;k++){
    int p=fn(a,i,k,dp);
    int q=fn(a,k,j,dp);
    int self=a[i]*a[j]*a[k];
    ans=Math.max(ans,p+q+self);
}
return dp[i][j]=ans;
    }
}
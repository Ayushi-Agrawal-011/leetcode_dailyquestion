class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int[][]dp=new int[nums1.length][nums2.length];
     
        return fn(nums1,nums2,0,0,dp);
    }
    public int fn(int[]nums1,int[]nums2,int i,int j,int[][]dp){
if(i==nums1.length || j==nums2.length)
return Integer.MIN_VALUE;
if(dp[i][j]!=0)
return dp[i][j];
int cur=nums1[i]*nums2[j];
int p1=fn(nums1,nums2,i+1,j+1,dp);
if(p1>0)
cur+=p1;
int p2=fn(nums1,nums2,i+1,j,dp);
int p3=fn(nums1,nums2,i,j+1,dp);
return dp[i][j]=Math.max(cur,Math.max(p2,p3));
    }
}
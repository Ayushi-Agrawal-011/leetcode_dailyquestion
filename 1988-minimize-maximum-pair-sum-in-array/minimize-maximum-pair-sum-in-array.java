class Solution {
    public int minPairSum(int[] nums) {
   Arrays.sort(nums);
   int maxi=0,n=nums.length;
   for(int i=0;i<n/2;i++){
    maxi=Math.max(maxi,nums[i]+nums[n-i-1]);
   }  
   return maxi;   
    }
}
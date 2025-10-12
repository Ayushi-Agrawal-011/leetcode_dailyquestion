class Solution {
    public int minPairSum(int[] nums) {
   Arrays.sort(nums);
   int maxi=0;
   for(int i=0;i<nums.length/2;i++){
    maxi=Math.max(maxi,nums[i]+nums[nums.length-i-1]);
   }   
   return maxi;
    }
}
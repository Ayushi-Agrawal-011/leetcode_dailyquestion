class Solution {
    public long subArrayRanges(int[] nums) {

      long c=0;
      for(int i=0;i<nums.length;i++){
        int mini=nums[i];
        int maxi=nums[i];
        for(int j=i;j<nums.length;j++){
            mini=Math.min(nums[j],mini);
              maxi=Math.max(nums[j],maxi);
            c+=maxi-mini;
        }
      }  
   
      return c;
    }
}
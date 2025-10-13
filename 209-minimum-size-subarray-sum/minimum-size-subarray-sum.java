class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int ei=0,si=0,sum=0;
      int ans=Integer.MAX_VALUE;
      while(ei<nums.length) {
        sum+=nums[ei];
        while(sum>=target){
             ans=Math.min(ans,ei-si+1);
         sum-=nums[si];
         si++;
        }
       
        ei++;
      } 
      if(ans!=Integer.MAX_VALUE)
      return ans;
      return 0;
        
    }
}
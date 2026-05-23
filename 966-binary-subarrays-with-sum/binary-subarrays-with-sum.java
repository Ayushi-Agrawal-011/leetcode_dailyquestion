class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return fn(nums,goal)-fn(nums,goal-1);
    }
    public int fn(int []nums,int goal){
         int ei=0,si=0;
       int ans=0,sum=0;
       while(ei<nums.length){
        sum+=nums[ei];
        while(sum>goal && si<=ei){
            sum-=nums[si];
            si++;
        }
    ans+=(ei-si+1);
      
        ei++;
       }
       return ans;
    }
}
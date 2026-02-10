class Solution {
    public int minOperations(int[] nums, int x) {
      int sum=0;
      for(int y:nums){
        sum+=y;
      } 
      int target=sum-x;
      if(target<0)
      return -1;
      if(target==0)
      return nums.length; 

      int si=0,ei=0;
      int ans=-1,curr=0;
      while(ei<nums.length){
          curr+=nums[ei];
          while(si<=ei && curr>target){
            curr-=nums[si];
            si++;
          }
          if(curr==target)
          ans=Math.max(ans,ei-si+1);
          ei++;
      }
      return ans==-1?ans:nums.length-ans;
    }
}
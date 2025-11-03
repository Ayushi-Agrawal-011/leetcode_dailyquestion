class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        return  p(nums,0,target,0);
    }
    public int p(int[]nums,int i,int target,int curr){
     
         if(i>=nums.length)
         return curr == target ? 1 : 0;
        int ls=p(nums,i+1,target,curr+nums[i]);
   int rs=p(nums,i+1,target,curr-nums[i]);    
   return ls+rs;   

    }
}
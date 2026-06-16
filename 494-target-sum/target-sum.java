class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fn(nums,target,0);
    }
    public static int fn(int[]nums,int target,int i){
       if(i==nums.length){
if(target==0)
 return 1;
 return 0;
       }

      
     
        int a=fn(nums,target-nums[i],i+1);
        int b=fn(nums,target+nums[i],i+1);
        return a+b;

    }
}
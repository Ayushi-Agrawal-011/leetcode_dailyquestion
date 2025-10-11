class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int  c=nums[0]+nums[1]+nums[2];

      for(int i=0;i<nums.length;i++){
   int left=i+1;
   int right=nums.length-1;
   while(left<right){
    int s=nums[i]+nums[left]+nums[right];
    if(Math.abs(s-target)<Math.abs(c-target)){
    c=s;
    }
    if(s<target){
        left++;
    }
    else if(s>target){
   right--;
    }
    else
    return s;

   }
      }
      return c;
    }
}
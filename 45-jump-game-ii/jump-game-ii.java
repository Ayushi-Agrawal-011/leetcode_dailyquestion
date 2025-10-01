class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
      int maxReach=0;
      int c=0;
      int endjump=0;
      for(int i=0;i<n-1;i++){
       
        maxReach=Math.max(maxReach,i+nums[i]);
        if(i==endjump){
            c++;
            endjump=maxReach;
        }
       
      }  
      return c;
    }
}
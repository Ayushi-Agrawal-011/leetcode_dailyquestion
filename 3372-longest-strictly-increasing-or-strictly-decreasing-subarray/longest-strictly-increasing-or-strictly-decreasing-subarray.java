class Solution {
    public int longestMonotonicSubarray(int[] nums) {
      int a=1,b=1;
      int c=1,d=1;
      for(int i=1;i<nums.length;i++){
        if(nums[i]<nums[i-1]){
            c++;
        }
        else{
            a=Math.max(a,c);
            c=1;
        }
      }  
       a=Math.max(a,c);
       for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            d++;
        }
        else{
            b=Math.max(b,d);
            d=1;
        }
      }  
       b=Math.max(b,d);
       return Math.max(a,b);
    }
}
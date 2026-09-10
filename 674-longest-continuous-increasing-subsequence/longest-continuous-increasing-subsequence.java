class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int d=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
            c++;
            else{
                
                d=Math.max(c,d);
                c=1;
            }
            
        }
    
        d=Math.max(c,d);
            return d;
    }
}
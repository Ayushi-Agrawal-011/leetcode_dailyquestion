class Solution {
    public int totalHammingDistance(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                s+=Integer.bitCount(nums[i]^nums[j]);
            }
        }
        return s;
    }

   
}
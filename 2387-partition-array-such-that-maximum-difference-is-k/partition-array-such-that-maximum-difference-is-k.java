class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int e=nums[0],c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-e>k){
                c++;
                e=nums[i];
            }
        }
        return c;
    }
}
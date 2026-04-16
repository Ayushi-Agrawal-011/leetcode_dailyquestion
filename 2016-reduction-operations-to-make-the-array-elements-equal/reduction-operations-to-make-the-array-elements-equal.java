class Solution {
    public int reductionOperations(int[] nums) {
      Arrays.sort(nums);
      int s=0,ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i])
            s++;
            ans+=s;
        }
        return ans;
    }
}
class Solution {
    public int maxScore(int[] nums, int k) {
        int total=0;
        for(int x:nums){
        total+=x;
        }
        if (k == nums.length) return total;
        int sum=0,ans=0;
        int wsize=nums.length-k;
        for(int i=0;i<wsize;i++){
            sum+=nums[i];

        }
        ans=sum;

        for(int i=wsize;i<nums.length;i++){
           sum+=nums[i]-nums[i-wsize];
           ans=Math.min(ans,sum);
        }
        return total-ans;
    }
}
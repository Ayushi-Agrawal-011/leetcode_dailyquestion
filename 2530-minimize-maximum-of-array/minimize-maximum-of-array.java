class Solution {
    public int minimizeArrayValue(int[] nums) {
           int low = 0;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(fn(nums,mid)){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    public boolean fn(int[]nums,int mid){
        long extra=0;
        for(int i=nums.length-1; i>0; i--){
            long current = nums[i] + extra;

            if(current>mid){
                extra=current-mid;
            }
            else
            extra=0;
        }
        return nums[0]+extra<=mid;
    }
}
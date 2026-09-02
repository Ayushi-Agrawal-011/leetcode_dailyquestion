class Solution {
    public int splitArray(int[] nums, int k) {
       int low = Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isitpossible(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isitpossible(int[]nums,int mid,int k){
        int employee=1;
       int assign=0;
       for(int i=0;i<nums.length;){
        if(nums[i]+assign<=mid){
            assign+=nums[i];
            i++;
        }
        else{
            employee++;
            assign=nums[i];
            i++;
        }
        if(employee>k)
        return false;
       }
       return true;
    }
}
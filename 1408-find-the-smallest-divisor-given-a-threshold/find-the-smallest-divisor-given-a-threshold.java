class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
      int lo=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            if(isitpossible(nums,mid,threshold)){
                ans=mid;
                high=mid-1;
            }
            else
            lo=mid+1;
        }
        return ans;
    }
      public boolean isitpossible(int[]nums,int mid,int th){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum<=th;
      }
}
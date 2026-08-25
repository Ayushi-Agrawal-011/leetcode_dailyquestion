class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int n=nums.length;  
     int[]left=new int[nums.length];
      int[]right=new int[nums.length];
      left[0]=nums[0];
      right[n-1]=nums[n-1];
      for(int i=1;i<n;i++){
        left[i]=Math.max(left[i-1],nums[i]);
      }
      for(int i=n-2;i>=0;i--){
        right[i]=Math.min(right[i+1],nums[i]);
      }
      for(int i=0;i<n;i++){
        int score=left[i]-right[i];
        if(score<=k)
        return i;
      }
      return -1;

    }
}
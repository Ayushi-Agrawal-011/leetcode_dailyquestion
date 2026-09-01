class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int[]left=new int[nums.length];
        int[]right=new int[nums.length];
             int n=nums.length;
      left[0] = Integer.MIN_VALUE;
        right[n - 1] = Integer.MIN_VALUE;
       
   
      
        for(int i=1;i<nums.length;i++){
            left[i]=Math.max(left[i-1],nums[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],nums[i+1]);
        }
        for(int i=0;i<n;i++){
            if(left[i]<nums[i] || right[i]<nums[i])
            ans.add(nums[i]);
        }
        return ans;
    }
}
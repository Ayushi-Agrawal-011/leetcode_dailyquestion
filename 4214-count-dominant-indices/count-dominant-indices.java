class Solution {
    public int dominantIndices(int[] nums) {
        int ans=0;
        
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                if(i!=j)
                sum+=nums[j];
            }
          double avg=(double)sum/(nums.length-i-1);
            if(nums[i]>avg)
            ans++;
        }
        return ans;
    }
}
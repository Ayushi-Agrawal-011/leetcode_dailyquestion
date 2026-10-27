class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int p=-1;
        int q=-1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]>nums[j] && nums[i]+nums[j]==target){
                    if(ans<nums[i]*nums[j]){
                        ans=nums[i]*nums[j];
                        p=i;
                        q=j;
                    }
                }
            }

        }
        if(ans==Integer.MIN_VALUE)
        return new int[]{-1,-1};
        return new int []{p,q};
    }
}
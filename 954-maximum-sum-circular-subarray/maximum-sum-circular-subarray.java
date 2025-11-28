class Solution {
    public int maxSubarraySumCircular(int[] nums) {
int maxi=nums[0];
int mini=nums[0];
int total=0,curr_maxi=0,curr_mini=0;
for(int i=0;i<nums.length;i++){
    total+=nums[i];
    curr_maxi+=nums[i];
    curr_mini+=nums[i];
    maxi=Math.max(maxi,curr_maxi);
    mini=Math.min(mini,curr_mini);
    if(curr_maxi<0){
        curr_maxi=0;
    }
    if(curr_mini>0){
        curr_mini=0;
    }
}
if(total==mini)
return maxi;
return Math.max(maxi,total-mini);
    }
}
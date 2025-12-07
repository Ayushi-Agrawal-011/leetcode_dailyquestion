class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    int si=0,ei=0,p=1,ans=0;
    while(ei<nums.length){
        p*=nums[ei];
        while(p>=k && si<=ei){
            p/=nums[si];
            si++;
        }
        ans+=ei-si+1;
        ei++;
    }
    return ans;
    }
}
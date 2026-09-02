class Solution {
    public int subarraySum(int[] nums, int k) {
        // if(nums.length==1){
        //     if(nums[0]==k)
        //     return 1;
        //     return 0;
        // }
    int ans=0;
    for(int i=1;i<=nums.length;i++){
        ans+=fn(nums,i,k);
    }
    return ans;
    }
    public int fn(int[]nums,int len,int k){
        int sum=0;
        for(int i=0;i<len;i++){
    sum+=nums[i];
        }
int ans=0;
        if(sum==k){
            ans++;
        }
        for(int i=len;i<nums.length;i++){
            sum+=nums[i]-nums[i-len];
            if(sum==k)
            ans++;
        }
        return ans;
    }
}
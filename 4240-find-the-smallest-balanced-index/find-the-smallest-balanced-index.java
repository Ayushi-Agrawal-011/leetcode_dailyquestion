class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long []left=new long[nums.length];
       
        int n=nums.length;
        left[0]=0;
        for(int i=1;i<n;i++){
left[i]=left[i-1]+nums[i-1];
        }

       
        long p=1;
        int ans=-1;
        for(int i=n-1;i>=0;i--){
            if(left[i]==p)
            ans=i;
            if(i>0){
                if(p>(1e14/nums[i]))
                p=(long)1e18;
                else
                p*=nums[i];
            }
        }
        return ans;
    }
}
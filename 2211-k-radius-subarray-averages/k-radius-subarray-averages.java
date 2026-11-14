class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
       int[]ans=new int[n] ;
        Arrays.fill(ans, -1);
       long[]pre=new long[n];
       pre[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        pre[i]=pre[i-1]+nums[i];
       }
       for(int i=0;i<n;i++){
        int l=i-k;
        int r=i+k;
        if (l >= 0 && r < n) {
                long sum;

                if (l == 0) {
                    sum = pre[r];
                } else {
                    sum = pre[r] - pre[l-1];
                }

                ans[i] = (int)(sum / (2*k+1));
        }
       }
       return ans;
    }

}
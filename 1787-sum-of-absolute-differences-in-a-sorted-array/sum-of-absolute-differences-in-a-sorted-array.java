class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int n = nums.length;

    int[] left = new int[n];
    int[] right = new int[n];
    int[] ans = new int[n];

   
    left[0] = nums[0];
    for(int i=1;i<n;i++){
        left[i] = left[i-1] + nums[i];
    }

    
    right[n-1] = nums[n-1];
    for(int i=n-2;i>=0;i--){
        right[i] = right[i+1] + nums[i];
    }
    for(int i=0;i<n;i++){

        int l = i * nums[i] - (i > 0 ? left[i-1] : 0);

      
        int r = (i < n-1 ? right[i+1] : 0) 
                - (n-i-1) * nums[i];

        ans[i] = l + r;
    }

    return ans; 
    }
}
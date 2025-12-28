class Solution {
   
     public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int c=1;
        if(k==1)
        return nums;
        int []result=new int[n-k+1];
        Arrays.fill(result,-1);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]+1)
            c=1;
            else{
                c++;
                if(c>=k)
                result[i-k+1]=nums[i];
            }
        }
   return result;
    
    }
  
}
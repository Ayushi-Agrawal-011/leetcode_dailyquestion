class Solution {
      public int timeRequiredToBuy(int[] nums, int k) {
        int c=0;
        int n=nums.length;
while(true){
 for(int i=0;i<n;i++){
            if(nums[i]>0){
 nums[i]--;
 
            c++;
            }
            if(i==k && nums[i]==0)
            return c;
           
        }
}
       

    }

   
}
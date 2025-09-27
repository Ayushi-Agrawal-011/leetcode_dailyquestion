class Solution {
    public int[] searchRange(int[] nums, int target) {
       int start=-1;
       int end=-1;
       int[] y=new int[2];
       int c=0;
        int k=0;
      if(nums.length!=0) 
       {for(int i=0;i<nums.length;i++) 
           { 
           if(nums[i]==target && c==0) {
               start=i;
               c=1;
           }
           else if(nums[i]==target) { 
                
                  end=i;
                  k=1;
                 
              
               }
           if(k==0) 
               end=start;
        }}
       y[0]=start;
       y[1]=end;
       return y;
        
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        int c=1,d=0;
        if(nums.length==0)
          return 0;
        Arrays.sort(nums);
       
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
              continue;
            if(nums[i]==(nums[i-1]+1))
              c++;
            else {
                d=Math.max(c,d);
                c=1;
            }  
        }
        d=Math.max(c,d);
        return d;
        
    }
}
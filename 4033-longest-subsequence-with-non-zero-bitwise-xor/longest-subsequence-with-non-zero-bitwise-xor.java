class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
      int xor=0;
     int count=0;
      for(int x:nums){
        if(x>0){
            xor^=x;
        }
        else
        count++;
      }  
      if(count==n)
      return 0;
      if(xor!=0)
      return n;

      return n-1;
    }
}
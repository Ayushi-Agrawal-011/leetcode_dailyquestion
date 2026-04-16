class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n%2==0 && m%2==0)
        return 0;
      int xor1=0,xor2=0;
      for(int x:nums1){
        xor1^=x;
      }
       for(int x:nums2){
        xor2^=x;
      }
        if(n%2==1 && m%2==1)
        return xor1^xor2;
            if(n%2==1 && m%2==0)
        return xor2;  
        
        return xor1;
    }
}
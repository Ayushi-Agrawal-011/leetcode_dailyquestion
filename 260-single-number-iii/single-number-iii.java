class Solution {
    public int[] singleNumber(int[] nums) {
           int xor=0;
        for(int x:nums){
            xor^=x;
            
        }
        int a=0;
   int mask=(xor &(-1*xor));
   for(int x:nums){
    if((mask & x)!=0)
    a^=x;
   }
   int b=xor^a;
   return new int []{a,b};
    }
}
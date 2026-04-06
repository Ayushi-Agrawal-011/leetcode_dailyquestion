class Solution {
    public int[] decompressRLElist(int[] nums) {
         int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
         int[]res=new int[size];
    int idx=0;
        for(int i=0;i<nums.length;i+=2){
        int f=nums[i];
        int val=nums[i+1];
        while(f-->0){
res[idx++]=val;
        }
    }
   
   
    return res;
}
}
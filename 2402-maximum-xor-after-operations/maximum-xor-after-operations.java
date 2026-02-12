class Solution {
    public int maximumXOR(int[] nums) {
     int or=0;
     for(int x:nums){
        or=or|x;
     } 
     return or;
    }
}
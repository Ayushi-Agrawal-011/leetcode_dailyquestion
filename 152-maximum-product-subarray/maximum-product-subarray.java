class Solution {
    public int maxProduct(int[] nums) {
     int maxp=nums[0];
     int minp=nums[0];
     int result=nums[0];
     for(int i=1;i<nums.length;i++){
        int num=nums[i];
        if(num<0){
            int temp=maxp;
            maxp=minp;
            minp=temp;
        }
        maxp=Math.max(num,maxp*num);
        minp=Math.min(num,minp*num);
        result=Math.max(result,maxp);
     }
     return result;
    }
}
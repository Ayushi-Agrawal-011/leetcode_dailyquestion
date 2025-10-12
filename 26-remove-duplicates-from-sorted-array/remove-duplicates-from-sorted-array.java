class Solution {
    public int removeDuplicates(int[] nums) {
        int [] x=new int[nums.length];
        int j=1;
x[0]=nums[0];
       for(int i=0;i<nums.length;i++){
if(x[j-1]!=nums[i]){
    x[j]=nums[i];
    j++;
}
       }
       for(int i=0;i<j;i++){
        nums[i]=x[i];
       }
       return j;
    }
}
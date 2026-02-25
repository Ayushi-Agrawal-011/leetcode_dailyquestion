class Solution {
    public int scoreDifference(int[] nums) {
       int p1=0;
       int p2=0;
       boolean onea=true;
       for(int i=0;i<nums.length;i++){
int f=0;
        if(nums[i]%2==1 ){
            onea=!onea;
        }
        if(i%6==5 ){
            onea=!onea;
        }
if(onea)
p1+=nums[i];
else if( !onea)
p2+=nums[i];
       } 
       return p1-p2;
    }
}
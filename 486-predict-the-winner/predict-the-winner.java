class Solution {
    public boolean predictTheWinner(int[] nums) {
          return score(nums,0,nums.length-1)>=0;
    }
    public int score(int []nums,int i,int j){
        if(i==j)
        return nums[j];
int start=nums[i]-score(nums,i+1,j);
int end=nums[j]-score(nums,i,j-1);
return Math.max(start,end);
    }
}
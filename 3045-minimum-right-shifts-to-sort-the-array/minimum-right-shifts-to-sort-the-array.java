class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int idx=-1;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)<nums.get(i-1)){
           if(idx==-1)
           idx=i;
           else
           return -1;
            }
        }
        return idx==-1 ?0:nums.get(nums.size()-1)>nums.get(0) ?  -1 :  nums.size()-idx;
    }
}
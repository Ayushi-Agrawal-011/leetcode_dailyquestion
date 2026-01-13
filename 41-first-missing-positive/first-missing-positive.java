class Solution {
    public int firstMissingPositive(int[] nums) {
    TreeSet<Integer> set=new TreeSet<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]>0)
        set.add(nums[i]);
    }
    if(!set.contains(1))
  return 1;
  for(int x:set){
    if(!set.contains(x+1))
    return x+1;
  }
  return -1;
    }
}
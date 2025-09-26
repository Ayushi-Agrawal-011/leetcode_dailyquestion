class Solution {
    public int firstMissingPositive(int[] nums) {
    //  TreeSet<Integer> set=new TreeSet<>();
    //  for(int i=0;i<nums.length;i++){
    //     if(nums[i]>0){
    //         set.add(nums[i]);
    //     }
    //  }
    //  int i=1;
    //  while(set.contains(i)){
    //     i++;
    //  }
    //  return i; 
  int i=1;
    Arrays.sort(nums);  
    for(int j=0;j<nums.length;j++){
        // if(nums[j]<0)
        // nums[j]=nums.length+1;
        if(nums[j]>0 && nums[j]==i){
            i++;
        }
        else if(nums[j]>0 && nums[j]>i){
       return i;
        }
    }
    // if(nums.length)
    if(nums[nums.length-1]<0)
    return 1;
    return nums[nums.length-1]+1;
    
    }
}
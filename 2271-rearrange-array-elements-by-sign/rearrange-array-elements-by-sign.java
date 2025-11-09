class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> p=new ArrayList<>();
       List<Integer> n=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]<0)
        n.add(nums[i]);
        else if(nums[i]>0)
 p.add(nums[i]);
       }
     
    int j=0;
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            nums[i]=p.get(j);
        
        }
        else{
nums[i]=n.get(j);
j++;
        }
        
        
       }
return nums;
    }
}
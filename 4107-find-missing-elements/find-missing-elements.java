class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
              List<Integer> ll=new ArrayList<>();
              
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            ll.add(nums[i]);
        }
       int min =nums[0];
       int max=nums[nums.length-1];
       int n=nums.length;
   for(int i=min+1;i<max;i++){
if(!ll.contains(i))
ans.add(i);
   }
   return ans;
    }
}
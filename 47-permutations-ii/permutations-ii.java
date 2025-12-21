class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
       List<Integer> curr=new ArrayList<>();
       Arrays.sort(nums);                     
        boolean[] used = new boolean[nums.length]; 
       p(nums,res,curr,used);
       return res; 
    }
      public void p(int []nums,List<List<Integer>> res,List<Integer> curr,boolean[]used){
      if(curr.size()==nums.length){
        res.add(new ArrayList<>(curr));
        return;
      }
    

      for(int i=0;i<nums.length;i++){
            if (used[i]) continue;  
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
                used[i] = true;
   
        curr.add(nums[i]);
        p(nums,res,curr,used);
        curr.remove(curr.size()-1);
          used[i] = false;
    

      }}
   

}
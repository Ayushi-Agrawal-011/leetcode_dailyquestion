class Solution {
    int c=0;
    public int countArrangement(int n) {
      List<List<Integer>> res=new ArrayList<>();
       List<Integer> curr=new ArrayList<>();
       int [] nums=new int[n];
       for(int i=0;i<n;i++){
        nums[i]=i+1;
       }
       p(nums,res,curr);
       return res.size();
    }
      public void p(int []nums,List<List<Integer>> res,List<Integer> curr){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!curr.contains(nums[i]) &&( nums[i]%(curr.size()+1)==0 || (curr.size()+1)% nums[i]==0 )){
                curr.add(nums[i]);
                p(nums,res,curr);
                 curr.remove(curr.size()-1);
            }
        }
    }
}
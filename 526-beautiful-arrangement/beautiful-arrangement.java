class Solution {
    public int countArrangement(int n) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        int q=1;

        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=q;
            q++;
        }
        p(nums,curr,res);
        return res.size();
    }
    public void p(int []nums,List<Integer>curr,List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
         if(!curr.contains(nums[i]) &&((curr.size()+1)%nums[i]==0  || nums[i]%(curr.size()+1)==0)){
            curr.add(nums[i]);
            p(nums,curr,res);
      curr.remove(curr.size()-1);
         }
        }
    }
}
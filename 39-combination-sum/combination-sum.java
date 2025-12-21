class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
List<List<Integer>> res=new ArrayList<>();
     List<Integer> ll=new ArrayList<>();
     fn(nums,target,0,res,ll);
     return res;

    }
    public void fn(int[]nums,int target,int idx,List<List<Integer>> res, List<Integer> ll){
         if(target==0){
            res.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(target>=nums[i]){
            ll.add(nums[i]);
            fn(nums,target-nums[i],i,res,ll);
            ll.remove(ll.size()-1);}
        
    }

    	}
}
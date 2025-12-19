class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
 List<List<Integer>> ans=new ArrayList<>();
    List<Integer> ll=new ArrayList<>();
fn(nums,target,0,ans,ll);
return ans;
    }
    public void fn(int[]nums,int target,int idx,List<List<Integer>> ans, List<Integer> ll){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(target>=nums[i]){
            ll.add(nums[i]);
            fn(nums,target-nums[i],i,ans,ll);
            ll.remove(ll.size()-1);
        }
    }
return ;
    	}
}
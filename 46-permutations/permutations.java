class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Print(nums,curr,res);
        return res;
        

    }
    public static void Print(int []nums,List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==nums.length){
        res.add(new ArrayList<>(curr));
        return;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(!curr.contains(a)){
                curr.add(nums[i]);
                Print(nums,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
 
}
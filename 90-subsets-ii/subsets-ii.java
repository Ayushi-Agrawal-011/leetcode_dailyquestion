class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
          List<List<Integer>> res=new ArrayList<>();
       List <Integer> cur=new ArrayList<>();
       Combination(nums,cur,0,res);
       return res;
    }
    	public static void Combination(int[] nums,List<Integer> cur, int idx, List<List<Integer>> res){
	//System.out.println(res);
  
        res.add(new ArrayList<>(cur));
    for(int i=idx;i<nums.length;i++){
        if(i>idx && nums[i]==nums[i-1]){
            continue;
        }
    cur.add(nums[i]);
    Combination(nums,cur,i+1,res);
        cur.remove(cur.size()-1);
        
		}}
}
class Solution {
  
    public List<List<Integer>> combinationSum2(int[] coin, int target) {
        Arrays.sort(coin);
   List<List<Integer>> res=new ArrayList<>();
       List <Integer> cur=new ArrayList<>();
       Combination(coin,cur,0,res,target);
       return res;  
	
	}
public static void Combination(int[] nums,List<Integer> cur, int idx, List<List<Integer>> res,int target){
	//System.out.println(res);
    if(target==0){
        res.add(new ArrayList<>(cur));
        return;
    }
  
       
    for(int i=idx;i<nums.length;i++){
        if(i>idx && nums[i]==nums[i-1]){
            continue;
        }
        if(target>=nums[i]){
    cur.add(nums[i]);
    Combination(nums,cur,i+1,res,target-nums[i]);
        cur.remove(cur.size()-1);
        }
		}}
	
	
}
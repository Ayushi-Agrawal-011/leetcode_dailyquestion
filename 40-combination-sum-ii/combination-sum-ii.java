class Solution {
  
    public List<List<Integer>> combinationSum2(int[] coin, int target) {
        Arrays.sort(coin);
   List<List<Integer>> res=new ArrayList<>();
       List <Integer> cur=new ArrayList<>();
      fn(coin,target,0,res,cur);
       return res;  
	
	}

       

	 public void fn(int []coins,int target,int idx,List<List<Integer>> res, List<Integer> ll){
         if(target==0 ){
          
            res.add(new ArrayList<>(ll));
            return;
        }
     
        for(int i=idx;i<coins.length;i++){
               if(i>idx && coins[i]==coins[i-1]){
            continue;
        }
            if(target>=coins[i]){
            ll.add(coins[i]);
            fn(coins,target-coins[i],i+1,res,ll);
            ll.remove(ll.size()-1);
            }
        
    }}
	
}
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
  List<List<Integer>> res=new ArrayList<>();
     List<Integer> ll=new ArrayList<>();
 fn(k,n,1,res,ll);
 return res;
      
    }
    public void fn(int k,int target,int idx,List<List<Integer>> res, List<Integer> ll){
         if(target==0 && ll.size()==k){
            res.add(new ArrayList<>(ll));
            return;
        }
        //    if (ll.size() >= k || target < 0) return;
        for(int i=idx;i<=9;i++){
             
            if(target>=i){
            ll.add(i);
            fn(k,target-i,i+1,res,ll);
            ll.remove(ll.size()-1);
            }
        
    }}
}

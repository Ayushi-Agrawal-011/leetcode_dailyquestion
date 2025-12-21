
class Solution {
   public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> res=new ArrayList<>();
     List<Integer> ll=new ArrayList<>();
     fn(res,ll,k,1,n);
     return res;
    }

    public static void  fn( List<List<Integer>> res,  List<Integer> ll,int k,int start,int n){
        if(ll.size()==k){
            res.add(new ArrayList<>(ll));
            return;
        }
        for(int i=start;i<=n;i++){
            ll.add(i);
            fn(res,ll,k,i+1,n);
            ll.remove(ll.size()-1);
        }
    
    }
}
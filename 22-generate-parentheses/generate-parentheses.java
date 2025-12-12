class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll=new ArrayList<>();
        fn(n,0,0,ll,"");
        return ll;
    }
    public  void fn(int n,int open,int closed, List<String> ll,String ans){
        if(n==open && n==closed){
            ll.add(ans);
            return;
        }
    
        if(  n<open ||open<closed )
        return;
        fn(n,open+1,closed,ll,ans+"(");
         fn(n,open,closed+1,ll,ans+")");
    }
    
}
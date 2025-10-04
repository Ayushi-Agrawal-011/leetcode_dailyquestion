class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll=new ArrayList<>();
        gp(n,0,0,ll,"");
        return ll;
    }
    public void  gp (int n,int open,int closed,List<String>ll,String ans){
          if(open==n && closed==n){
            ll.add(ans);
            return;
        }
        if(open>n || closed>open){
           
            return ;
        }
      
        gp(n,open+1,closed,ll,ans+"(");
        gp(n,open,closed+1,ll,ans+")");

    }
}
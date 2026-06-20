class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> ll=new ArrayList<>();
fn(n,"",ll,0,0);
return ll;
    }
    public  static void  fn(int n,String ans,List<String> ll,int open,int closed){
if(open==n && closed==n){
    ll.add(ans);
    return;
}
if(closed>open || open>n )
return;
fn(n,ans+"(",ll,open+1,closed);
fn(n,ans+")",ll,open,closed+1);

    }
}
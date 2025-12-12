class Solution {
     static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String s) {
      List<String> ll=new ArrayList<>();
fn(s,ll,"");
return ll;
    }
    public void fn(String s,List<String> ll,String ans){
if(s.length()==0){
    ll.add(ans);
    return;
}
       char p=s.charAt(0);
String q=key[p-'0'];
        for(int i=0;i<q.length();i++){
            fn(s.substring(1),ll,ans+q.charAt(i));
        }
    }

}
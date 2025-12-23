class Solution {
     static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String s) {
      List<String>  ll=new ArrayList<>();
      fn(s,"",ll);
      return ll;
    }
  public void fn(String ques,String ans,List<String> ll){
    if(ques.length()==0){
        ll.add(ans);
        return;
    }
    char ch=ques.charAt(0);
String v=key[ch-'0'];
for(int i=0;i<v.length();i++){
    fn(ques.substring(1),ans+v.charAt(i),ll);
}

  } 
}
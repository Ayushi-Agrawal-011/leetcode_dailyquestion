class Solution {
    public List<List<String>> partition(String s) {
  List<List<String>> res=new ArrayList<>();
  List<String> cur=new ArrayList<>();
  part(s,res,cur);
  return res;


    }
 public static void part(String s,List<List<String>> res,List<String> cur){
    if(0==s.length()){
        res.add(new ArrayList<>(cur));
        return;
    }
    for(int i=1;i<=s.length();i++){
        String a=s.substring(0,i);
        if(ispal(a)){
            cur.add(a);
            part(s.substring(i),res,cur);
            cur.remove(cur.size()-1);
        }
    }
 }
 public static boolean ispal(String s){
    int i=0,j=s.length()-1;
    while(i<j){
        if(s.charAt(i)!=s.charAt(j))
        return false;
        i++;
        j--;
    }
    return true;
 }
}
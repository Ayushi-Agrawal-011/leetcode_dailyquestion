public class Solution {
    public List<List<String>> partition(String s) {
    List<List<String>> res=new ArrayList<>();
    List<String> cur=new ArrayList<>();
    part(s,res,cur);
    return res;
    }
public void part(String s,    List<List<String>> res,List<String> cur){
   if(s.length()==0){
    res.add(new ArrayList<>(cur));
    return;
   }
   for(int i=1;i<=s.length();i++){
    String p=s.substring(0,i);
    if(ispal(p)){
        cur.add(p);
        part(s.substring(i),res,cur);
        cur.remove(cur.size()-1);
    }
   }
}
public boolean ispal(String s){
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
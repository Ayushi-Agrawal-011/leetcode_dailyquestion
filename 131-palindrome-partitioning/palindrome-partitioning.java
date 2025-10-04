class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> curr=new ArrayList<>();
 part(s,res,curr);
 return res;

    }
    public void part(String s, List<List<String>> res,List<String> curr){
        if(s.length()==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String a=s.substring(0,i);
            if(ispal(a)){
                curr.add(a);
                part(s.substring(i),res,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    public static boolean ispal(String s){
      int i=0,j=s.length()-1;
      while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
      }
      return true;
    }
}
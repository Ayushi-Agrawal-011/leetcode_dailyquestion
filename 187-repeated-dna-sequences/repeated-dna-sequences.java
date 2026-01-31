class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
      Set<String> set=new HashSet<>();
      List<String> ans=new ArrayList<>();
      for(int i=0;i+9<s.length();i++){
        String p=s.substring(i,i+10);
        if(set.contains(p) && !ans.contains(p)){
        ans.add(p);
     
        }
        else{
               set.add(p);
        }
      }  
      return ans;
    }
}
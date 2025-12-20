class Solution {
    public String longestWord(String[] words) {
     Arrays.sort(words);
 HashSet<String> map = new HashSet<>();
    String res="";
    for(int i=0;i<words.length;i++){
        String s=words[i];
        if(s.length()==1 || map.contains(s.substring(0,s.length()-1))){
        if(s.length()>res.length()){
  res=s;
        }
      
         map.add(s);}
    }
   return res;

  
    }
    
}
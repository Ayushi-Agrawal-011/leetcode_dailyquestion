class Solution {
    public String greatestLetter(String word) {
         Set<Character> set=new HashSet<>();
     for(char ch:word.toCharArray()){
        if(ch>=97 && ch<=122){
            set.add(ch);
        }
     }   
 String ans="";
 int no=-1;
     for(char ch:set){
        int idx=word.indexOf(ch-32);
        if(idx!=-1){
no=Math.max(no,ch-32);
        }
     }
     if(no==-1)
     return "";
     ans+=(char)(no);
     return ans;
    }
}
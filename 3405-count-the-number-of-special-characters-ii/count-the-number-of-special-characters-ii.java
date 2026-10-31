class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set=new HashSet<>();
     for(char ch:word.toCharArray()){
        if(ch>=97 && ch<=122){
            set.add(ch);
        }
     }   
     int ans=set.size();
     for(char ch:set){
    int i=  word.indexOf(ch-32);

        int j=word.lastIndexOf(ch);
        if(i==-1 || j>i){
ans--;
        }
     }
     return ans;
    }
}
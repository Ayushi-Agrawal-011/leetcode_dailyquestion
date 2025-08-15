class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
         return false;
        int v=0,c=0,d=0;
 
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>=65 && ch<=95 || ch>=97 && ch<=122){
                char lower = Character.toLowerCase(ch);
                   if ("aeiou".indexOf(lower) != -1) {
                    v++;
                } else {
                    c++;
                }
            }
            else if(ch>=48 && ch<=57)
            d++;
            else
            return false;
        }
        if(v==0 || c==0)
        return false;
        return true;
    }
}
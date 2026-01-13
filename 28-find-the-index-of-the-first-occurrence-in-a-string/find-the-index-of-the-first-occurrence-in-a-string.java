class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
        return -1;
      int idx=-1;
      int i=0;
     
      while(i<=haystack.length()-needle.length() ){
   int j=0;
   while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
   j++;
   if(j==needle.length())
   return i;
   i++;}
   return -1;
    }
}
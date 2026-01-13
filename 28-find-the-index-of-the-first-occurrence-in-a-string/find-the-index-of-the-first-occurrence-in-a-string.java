class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
        return -1;
      int idx=-1;
      int i=0;
      int j=0;
      while(i<haystack.length() && j<needle.length()){
if(haystack.charAt(i)==needle.charAt(j)){
    if(j==0)
    idx=i;
    j++;
     if( j==needle.length())
return idx;
i++;
    
}
else {
    if (j > 0) {               
          i = idx+1;   
        }
        else
        i++;
                j = 0;
                idx = -1;
    
}

      } 
    return -1; 
    }
}
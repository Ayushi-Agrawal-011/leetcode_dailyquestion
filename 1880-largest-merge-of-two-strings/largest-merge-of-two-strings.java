class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;
        while(i<n && j<m){
      char a=word1.charAt(i);
      char b=word2.charAt(j);
      if(a>b){
        sb.append(a);
        i++;
      }
      else if(b>a){
        sb.append(b);
        j++;
      }
      else{
        if(word1.substring(i).compareTo(word2.substring(j))>0){
             sb.append(a);
        i++;
        }
        else{
             sb.append(b);
        j++;
        }
      }
        }
        while(i<n){
          sb.append(word1.charAt(i));
          i++;  
        }
        while(j<m){
             sb.append(word2.charAt(j));
          j++; 
        }
        return sb.toString();
    }
}
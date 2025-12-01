class Solution {
    public String longestPalindrome(String s) {
    int c=Integer.MIN_VALUE;
    String p="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(ispal(s.substring(i,j+1))){
   c=Math.max(c,j-i);
   if(c==j-i)
   p=s.substring(i,j+1);
                }
             
            }
        }
        return p;
    }
    public  boolean ispal(String s){
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
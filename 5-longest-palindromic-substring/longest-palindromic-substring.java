class Solution {
    public String longestPalindrome(String s) {
        int ans=0;
        String k="";
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                if(ispal(s.substring(i,j))){
                 
                    if(ans<len){
                        ans=len;
                        k=s.substring(i,j);
                    }
                }
            }
        }
        return k;
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
class Solution {
    public boolean isPalindrome(String s) {
        String sb="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97  && s.charAt(i)<=122)
            sb+=s.charAt(i);
             else if(s.charAt(i)>=65  && s.charAt(i)<=90)
            sb+=(char)(s.charAt(i)+32);
            else if(s.charAt(i)>=48 && s.charAt(i)<=57)
            sb+=s.charAt(i);


        }
       
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}
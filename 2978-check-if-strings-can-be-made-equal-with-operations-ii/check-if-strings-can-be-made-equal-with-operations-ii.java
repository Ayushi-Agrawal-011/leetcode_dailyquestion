class Solution {
    public boolean checkStrings(String s1, String s2) {
        if(s1.length()!=s2.length())
        return false;
        String s1even="",s2even="";
          String s1odd="",s2odd="";
          for(int i=0;i<s1.length();i++){
            if(i%2==0){
              s1even+=s1.charAt(i);
              s2even+=s2.charAt(i);  
            }
            else{
                 s1odd+=s1.charAt(i);
              s2odd+=s2.charAt(i);  
            }
          }
          char[] a = s1even.toCharArray();
        char[] b = s2even.toCharArray();
        char[] c = s1odd.toCharArray();
        char[] d = s2odd.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        Arrays.sort(d);

        return Arrays.equals(a, b) && Arrays.equals(c, d);
    }
}
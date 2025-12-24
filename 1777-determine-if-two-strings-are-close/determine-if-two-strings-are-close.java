class Solution {
    public boolean closeStrings(String s1, String s2) {
        if(s1.length()!=s2.length())
        return false;
     int []a=new int[26];
     int[]b=new int[26];
     for(char ch:s1.toCharArray()){
        a[ch-'a']++;
     }
         for(char ch:s2.toCharArray()){
        b[ch-'a']++;
     }
       for(int i=0;i<26;i++){
        if((a[i]==0 && b[i]!=0) || (a[i]!=0 && b[i]==0) )
        return false;
       }
      Arrays.sort(a);
      Arrays.sort(b);
      return Arrays.equals(a,b);
        
    }
}
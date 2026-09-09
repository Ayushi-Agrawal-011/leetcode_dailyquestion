class Solution {
    public int countVowelSubstrings(String s) {
        int ans=0;
  for(int len=1;len<=s.length();len++){
    for(int j=len;j<=s.length();j++){
        int i=j-len;
        if(isVowelSubstr(s.substring(i,j)))
        ans++;
    }
  }
  return ans;
    }
    public boolean isVowelSubstr(String t){
        int c=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!isVowel(ch))
            return false;
            else
            set.add(ch);

        }
        return set.size()==5;
    }
    public boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
}
class Solution {
    public int addMinimum(String word) {
      int ans=0;

      String s="abc";
      int j=0;
      for(int i=0;i<word.length();){
        if(j==3)
        j=0;
        if(word.charAt(i)!=s.charAt(j)){
ans++;
j++;
        }
        else{
            i++;
            j++;
        }
      }
      ans += (3 - j) % 3;
      return ans;
    }
}
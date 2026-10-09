class Solution {
    public int minMovesToMakePalindrome(String s) {
      return fn(new StringBuilder(s),0,s.length()-1)  ;
    }
    public int fn(StringBuilder s,int i,int j){
        if(i>=j)
        return 0;
        if(s.charAt(i)==s.charAt(j)){
            return fn(s,i+1,j-1);
        }
        else{
            for(int k=j-1;k>i;k--){
                if(s.charAt(k)==s.charAt(i)){
                    int moves = j - k;

                    for (int p = k; p < j; p++) {
                        char temp = s.charAt(p);
                        s.setCharAt(p, s.charAt(p + 1));
                        s.setCharAt(p + 1, temp);
                    }
                      return moves + fn(s, i + 1, j - 1);
                }
            }
        }
        char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(i + 1));
            s.setCharAt(i + 1, temp);
return 1 + fn(s, i, j);
    }
}
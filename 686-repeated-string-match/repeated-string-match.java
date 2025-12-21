class Solution {
    public int repeatedStringMatch(String a, String b) {
        int c=1;
      StringBuilder sb=new StringBuilder(a);
      while(sb.length()<b.length()){
        sb.append(a);
        c++;
      }

         if(sb.indexOf(b)!=-1)
      return c;
      sb.append(a);
    if(sb.indexOf(b)!=-1)
      return c+1;
      return -1;

    }
}
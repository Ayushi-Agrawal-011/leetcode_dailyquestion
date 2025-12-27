class Solution {
    public String resultingString(String s) {
      Stack<Character> st=new Stack<>();
      int c=0;
      for(int i=0;i<s.length();i++){
        if(!st.isEmpty() && ((Math.abs((int)s.charAt(i)-(int)st.peek())==1
        ) ||(s.charAt(i)=='z' && st.peek()=='a') ||(s.charAt(i)=='a' && st.peek()=='z'))){
            st.pop();
            c=1;
        }
        if(c==1)
        c=0;
        else
         st.push(s.charAt(i));
         //System.out.println(st);
      }  
      StringBuilder p=new StringBuilder();
      for(char ch:st){
        p.append(ch);
      }
      return p.toString();
    }
}
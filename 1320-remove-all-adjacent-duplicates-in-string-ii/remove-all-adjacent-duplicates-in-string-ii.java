class Solution {
    public String removeDuplicates(String s, int k) {
    Stack <Character> st=new Stack<>();
    Stack<Integer> count=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() &&st.peek()==s.charAt(i)){
               count.push(count.pop()+1);
            }
            else{
                st.push(s.charAt(i));
                count.push(1);
            }
            if(count.peek()==k){
            st.pop();
            count.pop();
            }
        
        }
      StringBuilder sb=new StringBuilder();
      while(!st.isEmpty()){
        char ch=st.pop();
        int d=count.pop();
        while(d-->0){
            sb.append(ch);
        }
      }
      sb.reverse();
      return sb.toString();
}
}

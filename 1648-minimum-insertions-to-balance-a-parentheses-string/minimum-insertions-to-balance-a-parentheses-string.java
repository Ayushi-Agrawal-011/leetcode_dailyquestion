class Solution {
    public int minInsertions(String s) {
       Stack<Character> st=new Stack<>();
       int ans=0;
       int c=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            if (c == 1) {
                    ans++; 
                    c = 0;
                }
                st.push(ch);
        }
        else if(ch==')'){
            if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                    if (!st.isEmpty()) {
                        st.pop();
                    } else {
                        ans++;
                    }
                } else {
                    ans++;
                    if (!st.isEmpty()) {
                        st.pop();
                    } else {
                        ans++;
                    }
                }
        
            
        }

       } 
        ans += st.size() * 2;
      //  ans += c;
        return ans;
    }
}
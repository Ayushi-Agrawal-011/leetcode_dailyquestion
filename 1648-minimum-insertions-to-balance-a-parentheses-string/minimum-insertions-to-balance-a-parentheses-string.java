class Solution {
    public int minInsertions(String s) {
       Stack<Character> st=new Stack<>();
       int ans=0;
       int c=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
        //    ( ke baad abhi tak sirf ek ) mila hai aur uske baad naya ( aa gaya, toh pehle ek ) insert karna padega. Phir c = 0 karke naya ( stack mein push kar denge.
            if (c == 1) {
                    ans++; 
                    c = 0;
                }
                st.push(ch);
        }
        else if(ch==')'){ // Next bhi ) hai: )) ka pair complete hai, toh stack se ek ( pop karo. Stack empty ho toh ek ( insert karo.
            if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                    if (!st.isEmpty()) {
                        st.pop();
                    } else {
                        ans++;
                    }
                } else { 
                    // Next ) nahi hai ya next character exist nahi karta: ek ) insert karo, taaki )) complete ho; phir stack se ( pop karo, stack empty ho toh ( bhi insert karo.
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
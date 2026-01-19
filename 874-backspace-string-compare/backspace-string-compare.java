class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a=removeStars(s);
        String b=removeStars(t);
        
        return a.equals(b);
    }
    public String removeStars(String s) {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
               
                if(s.charAt(i)=='#')
                   st.pop();
                else
                   st.push(s.charAt(i)); 
            }
            else if(st.isEmpty() && s.charAt(i)!='#')
              st.push(s.charAt(i));
        }
       
        String k="";
        String p="";
        while(!st.isEmpty()){
            k+=st.pop();
        }
        for(int i=k.length()-1;i>=0;i--){
            p+=k.charAt(i);
        }
      
        return p;
    }
}
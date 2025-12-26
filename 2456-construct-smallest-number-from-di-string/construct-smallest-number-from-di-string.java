class Solution {
    public String smallestNumber(String str) {
       int[]ans=new int[str.length()+1];
       Stack<Integer> st=new Stack<>();
       int c=1;
       for(int i=0;i<=str.length();i++){
        if(i==str.length() || str.charAt(i)=='I'){
            ans[i]=c;
            c++;
            while(!st.isEmpty()){
                ans[st.pop()]=c;
                c++;
            }
        }
        else
        st.push(i);
  
       }
       String s="";
       for(int i=0;i<ans.length;i++){
       
        s+=ans[i];
       }
       return s;
    }
    
}
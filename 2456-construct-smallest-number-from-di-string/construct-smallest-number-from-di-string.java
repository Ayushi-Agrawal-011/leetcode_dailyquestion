class Solution {
    public String smallestNumber(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        int[]ans=new int[n+1];
        int c=1;
        for(int i=0;i<=s.length();i++){
            if( i==s.length() ||s.charAt(i)=='I'){
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
        String res="";
        for(int v:ans){
res+=v;
        }
        return res;
    }
}
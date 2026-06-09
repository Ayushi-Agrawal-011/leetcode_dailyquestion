class Solution {
    public String smallestNumber(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        int[]ans=new int[n+1];
        int c=1;
        for(int i=0;i<s.length()+1;i++){
           if(i==s.length() ||s.charAt(i)=='I'){
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
        String t="";
		for(int v:ans) {
			t+=v;
		}
		return t;
    }
}
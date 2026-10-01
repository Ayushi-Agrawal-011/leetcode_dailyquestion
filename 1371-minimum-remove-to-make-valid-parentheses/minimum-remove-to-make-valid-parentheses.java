class Solution {
    public String minRemoveToMakeValid(String s) {
        
        StringBuilder ans = new StringBuilder();
        int open=0;
        for(int i=0;i<s.length();i++ ){
            char ch=s.charAt(i);
            if(ch=='('){
            open++;
            ans.append(ch);
            }
            else if(ch==')'){
               if (open > 0) {
            open--;
            ans.append(ch);
        }
            }
        
        else {
        ans.append(ch);
    }}
  for(int i = ans.length() - 1; i >= 0 && open > 0; i--) {
            if(ans.charAt(i) == '(') {
                ans.deleteCharAt(i);
                open--;
            }
        }
    return ans.toString();
    }
}
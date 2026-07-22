class Solution {
    public int maxDepth(String s) {
        int open=0,closed=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            open++;
            else if(s.charAt(i)==')')
            closed++;
ans=Math.max(ans,open-closed);
        }
        return ans;
    }
}
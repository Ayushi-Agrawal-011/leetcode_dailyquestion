class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
int prev=0;
        for(String s:bank){
            int c=0;
            for(char ch:s.toCharArray()){
                if(ch=='1')
                c++;
            }
            if(c>0){
                ans+=prev*c;
                prev=c;
            }
        }
        return ans;
    }
}
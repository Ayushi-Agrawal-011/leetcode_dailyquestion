class Solution {
    public int minRotations(String s) {
        int ans=0;
        int curr=0;
        for(char ch:s.toCharArray()){
            int x=ch-'0';
            int diff=Math.abs(x-curr);
            ans+=Math.min(diff,10-diff);
            curr=x;
        }
        return ans;
    }
}
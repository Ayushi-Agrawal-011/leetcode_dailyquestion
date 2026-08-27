class Solution {
    public int[] divisibilityArray(String s, int m) {
        int n=s.length();
        long rem=0;
        int[]ans=new int[n];
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
             rem=(rem*10+digit)%m;
          ans[i]=  rem==0?1:0;
        }
        return ans;
    }
}
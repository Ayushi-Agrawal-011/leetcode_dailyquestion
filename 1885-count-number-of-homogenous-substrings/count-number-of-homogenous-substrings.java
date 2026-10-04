class Solution {
     private final int mod = 1000000007;
    public int countHomogenous(String s) {
        int ans=0;
        int c=0;
        char a=' ';
        for(char ch:s.toCharArray()){
            if(a!=ch){
                  ans = (int)((ans + (long)c * (c + 1) / 2) % mod);
           
                c=0;
                a=ch;
            }
            c++;
        }
           ans = (int)((ans + (long)c * (c + 1) / 2) % mod);

        return ans;
    }
}
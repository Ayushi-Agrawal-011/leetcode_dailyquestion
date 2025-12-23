class Solution {
    private static final int MOD = 1_000_000_007;
    public int numWays(String s) {
        long ones=0;
        for(int i=0;i<s.length();i++){
            ones += s.charAt(i) - '0';
        }
        if(ones==0){
            int n=s.length();
            return (int)(((long)(n-1)*(n-2)/2) % MOD);
            
        }
        if(ones%3!=0){
             return 0;
        }
    
        long tones=ones/3;
       long p1=0,p2=0,c=0;
       for(int i=0;i<s.length();i++){
        c+=s.charAt(i)-'0';
        if(c==tones)
        p1++;
        else if(c==2*tones)
        p2++;
       }
       return (int)(p1*p2 %MOD);
    }
    
}
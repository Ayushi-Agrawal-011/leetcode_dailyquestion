class Solution {
    public int minBitFlips(int start, int goal) {
        int c=0;
     while(start>0 || goal>0){
        int bita=start&1;
        int bitb=goal&1;
        if(bita!=bitb)
        c++;
        start>>=1;
        goal>>=1;
     } 
     return c;  
    }
}
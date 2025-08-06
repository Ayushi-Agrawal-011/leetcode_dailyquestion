class Solution {
    public int integerBreak(int n) {
     if(n<4)
     return n-1;   
     int c=4;
     for(int i=4;i<n;i++){
        if(c%2==0)
        c=c+c/2;
        else
        c=c+(c/3);

     }
     return c;
    }
}
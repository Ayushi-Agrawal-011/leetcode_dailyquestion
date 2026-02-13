class Solution {
    public int minFlips(int a, int b, int c) {
int co=0;
       while(a!=0 || b!=0 || c!=0){
       int abit=a&1;
       int bbit=b&1;
       int cbit=c&1;
       if(cbit==1){
        if(abit==0 && bbit==0){
   co++;
        }
       

       }
       else if(cbit==0){
        if(abit==1 ){
            co++;

       }
       if(bbit==1)
       co++;
       }
       a>>=1;
       b>>=1;
       c>>=1;}
       return co;
    }
}
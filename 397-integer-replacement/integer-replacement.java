class Solution {
    public int integerReplacement(int n) {
         if(n==2147483647)
         return 32;
     int c=0;
     while(n!=1){
        if(n%2==0)
          n/=2;
        else {
            if(n==3 || (n&2)==0)
             n--;
            else 
              n++;  
        }  
        c++;
     } 
     return c;
    }
}
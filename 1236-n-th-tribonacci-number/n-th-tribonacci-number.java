class Solution {
    public int tribonacci(int n) {
      return r(n); 
    }
    public int r(int n){
        if(n==0)
         return 0;
         else if(n==1 || n==2)
          return 1;
          int a=0;
          int b=1;
          int c=1;
          int k=0;
          for(int i=3;i<=n;i++){
            k=a+b+c;
            a=b;
            b=c;
            c=k;
          }
          return k;
    }
}
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=0;
        int b=0;
       
        for(int i=1;i<=n+n;i++){
            if(i%2==0)
            a+=i;
            else 
            b+=i;
        }
        System.out.println(a+" "+b);

        return fn(a,b);
    }
    public int fn(int a,int b){
        while(b!=0){
            int temp=a%b;
                 //System.out.println(a+" "+b);
            a=b;
          b=temp;
        }
        return a;
    }
}
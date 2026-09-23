class Solution {
    public int numberOfMatches(int n) {
        int c=0;
        while(n>1){
       //     System.out.println(c+" "+n);
if(n%2==0){
    c+=n/2;
    n=n/2;
}
else{
    int a=(n-1)/2;
    c+=a;
    n=a+1;
}

        }
        return c;
    }
}
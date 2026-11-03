class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long original=n;
        long place=1;
        while(sum(n)>target){
            place*=10;
            long add=place-(n%place); // kitna chhiye 0 bnanae k liye
            n+=add;
        }
        return n-original;
    }
    public long sum(long n){
        long s=0;
        while(n>0){
            s+=n%10;
            n=n/10;
        }
        return s;
    }
}
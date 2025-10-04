class Solution {
    public boolean isPowerOfTwo(int n) {
 return it(n);
    }
    public static boolean it(int n){
        if(n<=0)
        return false;
        if(n==1)
        return true;
        if(n%2!=0)
        return false;
        return it(n/2);

    }
}
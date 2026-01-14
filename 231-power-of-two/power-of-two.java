class Solution {
    public boolean isPowerOfTwo(int n) {
 return it(n);
    }
    public static boolean it(int n){
        if(n<=0)
        return false;
       return (n & (n-1))==0;

    }
}
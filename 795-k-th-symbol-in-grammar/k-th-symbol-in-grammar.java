class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1)
        return 0;
        int parentK=(k+1)/2;
        int  parent=kthGrammar(n-1,parentK);
        if(parent==0){
            return k%2==0?1:0;
        }
        else
        return k%2==1?1:0;

    }
}
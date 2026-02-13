class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0;
        for(int x:nums){
            xor^=x;

        }
        int c=0;
        while(xor>0 || k>0){
            int p=xor&1;
            int q=k&1;
            if(p!=q)
            c++;
            xor>>=1;
            k>>=1;
        }
        return c;
    }
}
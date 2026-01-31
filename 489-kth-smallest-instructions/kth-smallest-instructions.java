class Solution {
    public String kthSmallestPath(int[] destination, int k) {
        int rows=destination[0];
        int cols=destination[1];
        int n=rows+cols;
        int ch=cols,cv=rows;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(ch>0){
                long num=C(n-i-1,ch-1);
                if(k<=num){
                    sb.append('H');
                    ch--;
                }
                else{
                    sb.append('V');
                    k-=num;
                    cv--;
                }
            }else{
                sb.append('V');
                    cv--;
            }
        }
        return sb.toString();
    }
    private long C(int n, int r) {
        if (r < 0 || r > n) return 0;
        long res = 1;
        r = Math.min(r, n - r);
        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
        }
        return res;
    }
}
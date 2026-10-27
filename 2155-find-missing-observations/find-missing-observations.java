class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        int m=rolls.length;
        for(int r:rolls){
            sum+=r;
        }
        int tsum=mean*(n+m)-sum;
            if (tsum < n || tsum > 6 * n) {
            return new int[0];
        }

        int[]ans=new int[n];
        int distribute=tsum/n;
        int extra=tsum%n;
        Arrays.fill(ans,distribute);
        for(int i=0;i<extra;i++){
            ans[i]++;
        }
        return ans;
    }
}
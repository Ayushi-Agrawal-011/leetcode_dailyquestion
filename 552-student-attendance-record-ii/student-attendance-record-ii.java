class Solution {
    public int checkRecord(int n) {
        int[][][]dp=new int[n+1][2][3];
        for(int i=0;i<=n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return fn(n,0,0,dp);
    }
    public int fn(int n,int a,int l,int[][][]dp){
        if(n==0){
            return 1;
        }

        if (dp[n][a][l] != -1)
            return dp[n][a][l];
        long p=0,q=0,r=0;
        if(a<1){
            p+=fn(n-1,a+1,0,dp);
        }
        q+=fn(n-1,a,0,dp);
        if(l<2)
        r+=fn(n-1,a,l+1,dp);
       return dp[n][a][l] = (int)((p + q + r) % 1000000007);
       
    }
}
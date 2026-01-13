class Solution {
    public int countPrimes(int n) {
        if(n<=2)
        return 0;
        return fn(n);
    }
    public int fn(int n){
        int[]ans=new int[n];
        ans[0]=1;
        ans[1]=1;
        for(int i=2;i*i<=n;i++){
            if(ans[i]==0){
                for(int j=2;i*j<n;j++){
                    
                    ans[i*j]=1;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(ans[i]==0)
            c++;
        }
        return c;
    }
}
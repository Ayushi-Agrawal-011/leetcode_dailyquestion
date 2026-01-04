class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
       
         long MOD = 1_000_000_007;
        long sum = 0;
        long ans = 0;
        long total=0;
        for(int x:arr){
            total+=x;
        }
        for(int t=0;t<Math.min(k,2);t++){
            for(int y:arr){
                sum=Math.max(y,sum+y);
                ans=Math.max(ans,sum);
            }
        }
         if (k > 1 && total > 0) {
            ans = (ans + ((k - 2) * total) % MOD) % MOD;
        }
         
         

        return (int)(ans % MOD); 
    

       
    }
}
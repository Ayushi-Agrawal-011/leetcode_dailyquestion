class Solution {
    public long zeroFilledSubarray(int[] prices) {
long c=0,d=0;
      long ans=prices.length;
        for(int i=0;i<prices.length;i++){
            if(prices[i]==0)
           c=c+1;
           else
           c=0;
           d+=c;
          
        }
        return d;
    }
}
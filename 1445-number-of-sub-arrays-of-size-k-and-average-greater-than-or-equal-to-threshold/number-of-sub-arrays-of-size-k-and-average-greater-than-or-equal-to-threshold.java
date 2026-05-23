class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ei=k,si=0;
        int ans=0,sum=0;
        for(int i=0;i<k;i++){
sum+=arr[i];
        }
        if((sum/k)>=threshold)
        ans++;
        while(ei<arr.length){
            sum+=(arr[ei]-arr[ei-k]);
           if((sum/k)>=threshold){
           
            ans++;
           
           }
          
           ei++;
            
        }

        return ans;
    }
}
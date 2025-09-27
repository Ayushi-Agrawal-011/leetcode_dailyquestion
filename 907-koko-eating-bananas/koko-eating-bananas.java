class Solution {
    public int minEatingSpeed(int[] candies, int k) {
        
    int max=candies[0];
        for(int i=1;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }
        int low=1,high=max;
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(valid(mid,candies,k)){
                ans=mid;
                 high=mid-1;
              
            }
            else{
                 low=mid+1;
            }
        }
        return ans;
    }
    public boolean valid(int mid,int []candies,long k){
        long c=0;
        for(int i=0;i<candies.length;i++){
           
            c+=candies[i]/mid;
            if(candies[i]%mid!=0)
            c++;
        }
        return c<=k;
}}
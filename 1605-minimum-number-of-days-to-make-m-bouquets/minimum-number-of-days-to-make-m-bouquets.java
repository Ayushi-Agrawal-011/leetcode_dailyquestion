class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isitpossible(bloomDay,mid,k,m)){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    public boolean isitpossible(int[]bloomday,int mid,int k,int m){
        int fcollected=0;
        int bouquet=0;
        for(int e:bloomday){
            if(e<=mid)
               fcollected++;
               else
               fcollected=0;
               if(fcollected==k){
                bouquet++;
                fcollected=0;
               }
        }
        return bouquet>=m;
    }
}
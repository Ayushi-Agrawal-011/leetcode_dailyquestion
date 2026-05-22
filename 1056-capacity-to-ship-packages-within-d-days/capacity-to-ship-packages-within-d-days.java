class Solution {
    public int shipWithinDays(int[] piles, int h) {
        
       int lo=Arrays.stream(piles).max().getAsInt();
        int high=Arrays.stream(piles).sum();
        int ans=0;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            if(isitpossible(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else
            lo=mid+1;
        }
        return ans;
    }
    public boolean isitpossible(int[]piles,int k,int h){
    long days=1;
int shipped=0;
    for(int i=0;i<piles.length;i++){

     shipped+=piles[i];
     if(shipped>k){
        shipped=piles[i];
        days++;
     }
    }
    return days<=h;


    }
}
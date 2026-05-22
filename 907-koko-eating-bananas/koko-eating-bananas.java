class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=high;
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
    public boolean isitpossible(int[]piles,int k,long h){
    long hours=0;
    for(int i=0;i<piles.length;i++){
        int atehour=piles[i]/k;
        int rem=piles[i]%k;
        hours+=atehour;
        if(rem!=0)
        hours++;
    }
    return hours<=h;


    }
}
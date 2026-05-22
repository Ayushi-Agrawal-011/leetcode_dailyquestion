class Solution {
    public int hIndex(int[] citations) {
        
      int ans=0;
        int lo=0;
        int high=1000;
while(lo<=high){
    int mid=lo+(high-lo)/2;
    if(isitpossible(citations,mid)){
        ans=mid;
        lo=mid+1;
    }
    else
    high=mid-1;
}
return ans;
    }
    public boolean isitpossible(int[]citations,int mid){
        int c=0;
        for(int i=0;i<citations.length;i++){
           if(citations[i]>=mid)
           c++;
            
        }
        return c>=mid;
    }
}
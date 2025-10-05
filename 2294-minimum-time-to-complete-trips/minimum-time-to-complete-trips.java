class Solution {
    public long minimumTime(int[] time, int totalTrips) {
         long left = 1; 
        long right = (long) 1e14; 
        long ans=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            long trips=sum(time,mid);
            if(trips>=totalTrips){
                ans=mid;
                right=mid-1;
            }
            else
            left=mid+1;
        }
        return ans;
    }
public long sum(int []arr,long t){
long k=0;
for(int i=0;i<arr.length;i++){
    k+=t/arr[i];
    if(k==1e14)
     break;

}
return k;
}
 
}

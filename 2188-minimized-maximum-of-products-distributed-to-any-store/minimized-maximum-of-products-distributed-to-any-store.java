class Solution {
    public int minimizedMaximum(int n, int[] arr) {
        int low=1;
        int high=Arrays.stream(arr).max().getAsInt();
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(fn(arr,mid)<=n){
                ans=mid;
               high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    public int fn(int[]arr,int mid){
        int s=0;
        for(int i=0;i<arr.length;i++){
          s += (arr[i] + mid - 1) / mid;
        }
        return s;
    }
}
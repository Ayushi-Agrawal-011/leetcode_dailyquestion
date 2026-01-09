class Solution {
    public int lengthOfLIS(int[] arr) {
     int[]dp=new int[arr.length];
     int len =1;
     dp[0]=arr[0];
     for(int i=1;i<arr.length;i++){
        if(arr[i]>dp[len-1]){
            dp[len]=arr[i];
            len++;
        }
        else{
            int idx=bs(dp,0,len-1,arr[i]);
            dp[idx]=arr[i];
        }
     }
     return len;
	}
    public int bs(int[]dp,int lo,int hi,int item){
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(dp[mid]>=item){
                hi=mid-1;
                ans=mid;
            }
            else
            lo=mid+1;
        }
        return ans;
    }
   
	
}
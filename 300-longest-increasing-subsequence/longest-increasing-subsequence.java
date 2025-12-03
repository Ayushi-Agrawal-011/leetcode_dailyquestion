class Solution {
    public int lengthOfLIS(int[] arr) {
int len=1;
int []dp=new int[arr.length];
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
   public int bs(int[]arr,int si,int ei,int item){
    int idx=0;
    while(si<=ei){
  int mid=(si+ei)/2;
  if(arr[mid]>=item){
    idx=mid;
    ei=mid-1;
  }
  else
  si=mid+1;
    }
    return idx;
   }
	
}
class Solution {
    public int subarraySum(int[] arr, int k) {
        int ans=0;
  for(int i=1;i<=arr.length;i++){
ans+=fn(arr,i,k);
  }
  return ans;

    }
    public int fn(int[]arr,int k,int t){
int ans=0,sum=0;
for(int i=0;i<k;i++){
sum+=arr[i];
}
int c=0;
if(sum==t){
    c++;
}
for(int i=k;i<arr.length;i++){
    sum+=arr[i]-arr[i-k];
    if(sum==t){
        c++;
    }
}
return c;
    }

}
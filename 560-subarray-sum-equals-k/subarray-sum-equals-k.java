class Solution {
    public int subarraySum(int[]arr, int k) {
    int ans=0,sum=0;
    int r=k;
for(int  i=1;i<=arr.length;i++){
int l=fn(arr,i, r);
ans+=l;
//System.out.println(l);
}
return ans;
    }
    public int fn(int[]arr,int k,int r){
        int ans=0,sum=0;
    for(int i=0;i<k;i++){
        sum+=arr[i];
    } 
    ans=sum;
    int c=0;
    if(sum==r)
    c=1;
    for(int i=k;i<arr.length;i++){
        sum+=(arr[i]-arr[i-k]);
        //System.out.println(sum);
        if(sum==r)
        c++;
    }
    return c;
    }

}
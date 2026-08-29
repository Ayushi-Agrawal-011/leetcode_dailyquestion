class Solution {
    public int wateringPlants(int[] arr, int c) {
        int ans=0;
        int refill=c;
        for(int i=0;i<arr.length;i++){
if(arr[i]<=c){
    c-=arr[i];
    ans++;
}
else{
    ans+=i;
    c=refill;
    c-=arr[i];
    ans+=i+1;
}
        }
        return ans;
    }
}
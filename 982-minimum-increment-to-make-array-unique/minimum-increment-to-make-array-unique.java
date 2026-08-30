class Solution {
    public int minIncrementForUnique(int[] arr) {
     int ans=0;
   Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
int required=arr[i-1]+1;
ans+=required-arr[i];
arr[i]=required;
            }
         
        }
        return ans;    
    }
}
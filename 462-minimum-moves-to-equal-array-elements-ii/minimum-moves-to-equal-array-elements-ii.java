class Solution {
    public int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int median =0;
        if(n%2!=0){
median=arr[n/2];
        }
        else{
            int a=arr[n/2];
            int b=arr[(n/2)-1];
            median=(a+b)/2;
        }
        
        int ans=0;
        for(int x:arr){
ans+=Math.abs(median-x);
        }
        return ans;
    }
}
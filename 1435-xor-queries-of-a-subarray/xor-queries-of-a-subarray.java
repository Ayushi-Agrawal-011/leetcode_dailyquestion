class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
     int[]left=new int[arr.length];
     left[0]=arr[0];
     for(int i=1;i<arr.length;i++){
        left[i]=left[i-1]^arr[i];
     } 
     int j=0;
     int[]ans=new int[queries.length]; 
     for(int i=0;i<queries.length;i++){
        int l=queries[i][0];
        int r=queries[i][1];
        if(l==0)
        ans[j++]=left[r];
        else
        ans[j++]=left[r]^left[l-1];
     } 
     return ans;
    }
}
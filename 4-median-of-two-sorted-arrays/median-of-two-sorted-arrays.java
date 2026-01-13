class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int c=0;
       int[]arr=new int[nums1.length+nums2.length];
       for(int i=0;i<nums1.length;i++){
        arr[c]=nums1[i];
        c++;
       }
       for(int i=0;i<nums2.length;i++){
        arr[c]=nums2[i];
        c++;
       }
       Arrays.sort(arr);
       int len=nums1.length+nums2.length;
       if(len%2!=0)
       return (double)arr[len/2];
       double a=(double)arr[len/2];
       double b=(double)arr[(len/2)-1];
       return (double)(a+b)/2;
       
    }
}
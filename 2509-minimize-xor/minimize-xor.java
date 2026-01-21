class Solution {
    public int minimizeXor(int nums1, int nums2) {
       int c=0;
       while(nums2>0){
        nums2=(nums2&(nums2-1));
        c++;
       } 
       int x=0;
       for(int i=30;i>=0;i--){
        int mask=(1<<i);
        if((nums1 & mask)!=0){
            x|=mask;
            c--;
            if(c==0)
            return x;
        }
       }
        for(int i=0;i<=30;i++){
        int mask=(1<<i);
        if((nums1 & mask)==0){
            x|=mask;
            c--;
            if(c==0)
            return x;
        }
       }
       return x;
    }
}
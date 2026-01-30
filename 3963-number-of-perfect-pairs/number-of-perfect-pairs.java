class Solution {
    public long perfectPairs(int[] nums) {
       int n=nums.length;
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=Math.abs(nums[i]);
        }
        Arrays.sort(a);
        long c=0;
        int si=0;
        for(int i=0;i<n;i++){
            if(si<i+1)
                si=i+1;
            while(si<n && a[si]<=2*a[i]){
                si++;
            }
            c+=(si-i-1);
        }
        return c;
    }
}
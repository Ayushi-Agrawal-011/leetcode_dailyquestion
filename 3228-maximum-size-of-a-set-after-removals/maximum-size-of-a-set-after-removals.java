class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();
        for(int x:nums1){
            s1.add(x);
            s3.add(x);
        }
        for(int x:nums2){
            s2.add(x);
            s3.add(x);
        }
        int n1=nums1.length;
        int n2=nums2.length;
        return Math.min(s3.size(),Math.min(s1.size(),n1/2)+Math.min(s2.size(),n2/2));
    }
}
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long maxi=(long)Arrays.stream(nums).max().getAsInt();
        long mini=(long)Arrays.stream(nums).min().getAsInt();
        long diff=(maxi-mini);
        return (long)k*diff;
    }
}
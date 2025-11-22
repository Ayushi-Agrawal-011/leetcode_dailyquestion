class Solution {
    public int minMoves(int[] nums) {
        int mini=Arrays.stream(nums).min().getAsInt();
        int c=0;
        for(int x:nums){
            c+=(x-mini);
        }
        return c;
    }
}
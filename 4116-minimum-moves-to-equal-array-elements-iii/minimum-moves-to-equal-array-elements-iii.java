class Solution {
    public int minMoves(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        for(int x:nums){
            ans+=Math.abs(x-max);
        }
        return ans;
    }
}
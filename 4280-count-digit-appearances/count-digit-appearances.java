class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int i=0;i<nums.length;i++ ){
            String s=Integer.toString(nums[i]);
            for(char ch:s.toCharArray()){
                if((int)ch-'0'==digit)
                ans++;
            }
        }
        return ans;
    }
}
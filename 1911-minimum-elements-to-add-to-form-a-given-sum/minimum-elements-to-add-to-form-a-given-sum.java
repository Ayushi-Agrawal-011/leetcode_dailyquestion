class Solution {
    public int minElements(int[] nums, int limit, int goal) {
         long s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }

        long d = (long)goal - s;
        long k = Math.abs(d);

       

        if (k % limit > 0) {
            return (int)(k / limit) + 1;
        }
        return (int)(k / limit);

    }
}
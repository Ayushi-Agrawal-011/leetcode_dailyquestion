class Solution {
    public int minimumAverageDifference(int[] nums) {

        int n = nums.length;

        long[] left = new long[n];
        long[] right = new long[n];

        left[0] = nums[0];
        right[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i];
        }

        long minDiff = Long.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            long leftavg = left[i] / (i + 1);

            long rightavg = 0;
            if (i != n - 1) {
                rightavg = right[i + 1] / (n - i - 1);
            }

            long diff = Math.abs(leftavg - rightavg);

            if (diff < minDiff) {
                minDiff = diff;
                ans = i;
            }
        }

        return ans;
    }
}
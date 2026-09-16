class Solution {
    public int minDays(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return fn(n, dp);
    }

    public int fn(int n, int[] dp) {
        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for (int day = 1; sum + day <= n; day++) {
            sum += day;

            int a = fn(n - sum, dp);// pints earnd by day

            if (a != Integer.MAX_VALUE) {
            
                if (n - sum == 0)
                    ans = Math.min(ans, a + day);//earn
                else
                    ans = Math.min(ans, a + day + 1);//skip
            }
        }

        return dp[n] = ans;
    }
}
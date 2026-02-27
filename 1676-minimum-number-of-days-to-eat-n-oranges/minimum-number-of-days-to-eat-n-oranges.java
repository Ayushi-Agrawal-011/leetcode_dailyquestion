class Solution {

    Map<Integer, Integer> dp = new HashMap<>();

    public int minDays(int n) {
        return fn(n);
    }

    public int fn(int n) {
        if (n <= 1)
            return n;

        if (dp.containsKey(n))
            return dp.get(n);

        int a = n % 2 + fn(n / 2);
        int b = n % 3 + fn(n / 3);

        int ans = 1 + Math.min(a, b);

        dp.put(n, ans);

        return ans;
    }
}
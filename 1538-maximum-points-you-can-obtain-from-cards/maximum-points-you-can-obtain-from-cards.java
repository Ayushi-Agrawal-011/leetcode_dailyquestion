class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int x : cardPoints) total += x;

        if (k == n) return total;

        int windowSize = n - k;
        int curr = 0;

        for (int i = 0; i < windowSize; i++) {
            curr += cardPoints[i];
        }

        int minSum = curr;

        for (int i = windowSize; i < n; i++) {
            curr += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, curr);
        }

        return total - minSum;
    }
}
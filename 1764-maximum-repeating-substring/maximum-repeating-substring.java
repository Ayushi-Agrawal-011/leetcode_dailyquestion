class Solution {
    public int maxRepeating(String sequence, String word) {
      int n = sequence.length();
        int len = word.length();
        int[] dp = new int[n + 1]; 
        int max = 0;
        for (int i = len; i <= n; i++) {
            if (sequence.substring(i - len, i).equals(word)) {
                dp[i] = dp[i - len] + 1;  
                max = Math.max(max, dp[i]);
            }
        }

        return max;
        
    }
}
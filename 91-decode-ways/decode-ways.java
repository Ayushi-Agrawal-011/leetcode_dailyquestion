class Solution {
    public int numDecodings(String s) {
   if (s == null || s.length() == 0) return 0;
   int [] dp=new int[s.length()];
   Arrays.fill(dp,-1);
        return decode(s, 0,dp);

    }
    public static int decode(String s, int index,int [] dp) {
        if (index == s.length()) return 1; // Successfully decoded entire string
        if (s.charAt(index) == '0') return 0; // Leading '0' is invalid
if(dp[index]!=-1)
return dp[index];
        // Take a single character
        int ways = decode(s, index + 1,dp);

        // Take two characters if valid (10-26)
        if (index + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(index, index + 2));
            if (num >= 10 && num <= 26) {
                ways += decode(s, index + 2,dp);
            }
        }
        return dp[index]=ways;
    }
}
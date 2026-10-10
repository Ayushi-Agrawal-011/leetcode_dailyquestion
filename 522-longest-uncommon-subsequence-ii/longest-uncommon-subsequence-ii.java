class Solution {
    public int findLUSlength(String[] strs) {
 
        Arrays.sort(strs, (a, b) -> b.length() - a.length());
        int ans = -1;

        for (int i = 0; i < strs.length; i++) {
            boolean found = false;

            for (int j = 0; j < strs.length; j++) {
                if (i != j && isSubsequence(strs[i], strs[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans = Math.max(ans, strs[i].length());
            }
        }

        return ans;
    }

    public boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == a.length();
    
}
    }
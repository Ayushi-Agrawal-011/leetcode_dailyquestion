class Solution {
    HashMap<String, Boolean> dp;

    public boolean canMakeSubsequence(String s, String t) {
        dp = new HashMap<>();
        return fn(s, t, 0, 0, false);
    }

    public boolean fn(String s, String t, int i, int j, boolean replaced) {

        if(i == s.length())
            return true;

        if(j == t.length())
            return false;

        String key = i + "," + j + "," + replaced;

        if(dp.containsKey(key))
            return dp.get(key);

        
        int k = t.indexOf(s.charAt(i), j);

        boolean ans = false;

        if(k != -1)
            ans = fn(s, t, i + 1, k + 1, replaced);
        if(!replaced) {
            
            ans = ans || fn(s, t, i + 1, j + 1, true);
        }

        dp.put(key, ans);
        return ans;
    }
}
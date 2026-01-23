class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>(); // duplicates ke liye
        int n = nums.length;

        for (int i = 3; i < (1 << n); i++) {
            if (count_setBit2(i) >= 2) {
                List<Integer> seq = isitpossible(nums, i);
                if (!seq.isEmpty() && set.add(seq)) { // HashSet me add = check + insert
                    res.add(seq);
                }
            }
        }
        return res;
    }

    private static List<Integer> isitpossible(int[] c, int i) {
        List<Integer> ans = new ArrayList<>();
        int idx = 0;

        while (i > 0) {
            if ((i & 1) == 1) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) <= c[idx]) {
                    ans.add(c[idx]);
                } else {
                    return new ArrayList<>();
                }
            }
            i >>= 1;
            idx++;
        }
        return ans;
    }

    private static int count_setBit2(int n) {
        int ans = 0;
        while (n > 0) {
            n &= (n - 1);
            ans++;
        }
        return ans;
    }
}

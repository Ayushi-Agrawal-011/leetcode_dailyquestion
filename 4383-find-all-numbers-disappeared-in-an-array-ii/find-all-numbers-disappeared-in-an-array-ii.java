class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        for (int i = lower; i <= upper;) {

            if (!set.contains(i)) {

                List<Integer> p = new ArrayList<>();

                int start = i;
                int end = i;

                i++;

                while (i <= upper && !set.contains(i)) {
                    end = i;
                    i++;
                }

                p.add(start);
                p.add(end);
                ans.add(p);

            } else {
                i++;
            }
        }

        return ans;
    }
}
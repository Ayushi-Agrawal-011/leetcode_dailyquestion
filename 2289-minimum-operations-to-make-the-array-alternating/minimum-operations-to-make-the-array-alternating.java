class Solution {
    public int minimumOperations(int[] nums) {
        
 int n = nums.length;
        if (n == 1) return 0;

        Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
            else
                odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
        }

        int[] e = topTwo(even); // {value1, count1, value2, count2}
        int[] o = topTwo(odd);

        if (e[0] != o[0]) {
            return n - (e[1] + o[1]);
        } else {
            return Math.min(
                n - (e[1] + o[3]),
                n - (e[3] + o[1])
            );
        }
    }

    private int[] topTwo(Map<Integer, Integer> map) {
        int v1 = -1, c1 = 0, v2 = -1, c2 = 0;
        for (int k : map.keySet()) {
            int c = map.get(k);
            if (c > c1) {
                v2 = v1; c2 = c1;
                v1 = k;  c1 = c;
            } else if (c > c2) {
                v2 = k;  c2 = c;
            }
        }
        return new int[]{v1, c1, v2, c2};
    }
}
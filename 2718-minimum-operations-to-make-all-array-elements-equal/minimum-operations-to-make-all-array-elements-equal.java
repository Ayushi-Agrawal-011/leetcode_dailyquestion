class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        long[] prefix = new long[n + 1];

        // Prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for(int i=0;i<queries.length;i++){
                      int l = 0, r = n;

            while (l < r) {

                int mid = l + (r - l) / 2;

                if (nums[mid] <= queries[i]) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }

            int idx = l;
        long left=(long)idx*queries[i]-prefix[idx];
        long right = (prefix[n] - prefix[idx])
           - (long)queries[i] * (n - idx);
ans.add(left+right);

        }
        return ans;
    }
}
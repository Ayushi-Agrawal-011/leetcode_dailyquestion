
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        return fn(nums, k);
    }

    public long fn(int[] arr, int k) {

        long ans = 0, sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            sum += arr[i];
        }

        if (map.size() == k) {
            ans = Math.max(ans, sum);
        }

        for (int i = k; i < arr.length; i++) {

            int old = arr[i - k];

            map.put(old, map.get(old) - 1);

            if (map.get(old) == 0) {
                map.remove(old);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            sum -= old;
            sum += arr[i];

            if (map.size() == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}


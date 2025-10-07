class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, List<Integer>> mp = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            String str = Integer.toBinaryString(arr[i]);
            int c = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1')
                    c++;
            }

            // Add number to the list for this bit count
            mp.computeIfAbsent(c, k -> new ArrayList<>()).add(arr[i]);
        }

        int[] nums = new int[arr.length];
        int k = 0;

        for (int key : mp.keySet()) {
            List<Integer> list = mp.get(key);
            Collections.sort(list);  // sort numbers with same bit count
            for (int val : list) {
                nums[k++] = val;
            }
        }

        return nums;
    }
}

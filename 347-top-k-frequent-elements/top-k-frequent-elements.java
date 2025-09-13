class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
         TreeMap<Integer, List<Integer>> mp = new TreeMap<>(Collections.reverseOrder());
        int []arr=new int[k];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

		  for (int num : map.keySet()) {
            int freq = map.get(num);
            mp.putIfAbsent(freq, new ArrayList<>());
            mp.get(freq).add(num);
        }

        int i=0;
		  for (int freq : mp.keySet()) {
            for (int num : mp.get(freq)) {
                if (i < k) {
                    arr[i++] = num;
                } else {
                    break;
                }
            }
            if (i >= k) break;
        }

        return arr;
    }
   
}
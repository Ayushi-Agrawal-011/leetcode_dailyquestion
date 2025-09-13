class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         TreeMap<String, Integer> map = new TreeMap<>();
         TreeMap<Integer, List<String>> mp = new TreeMap<>(Collections.reverseOrder());
       List<String> ll=new ArrayList<>();
        for (String num : words) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

		  for (String num : map.keySet()) {
            int freq = map.get(num);
            mp.putIfAbsent(freq, new ArrayList<>());
            mp.get(freq).add(num);
        }

        int i=0;
		  for (int freq : mp.keySet()) {
            for (String num : mp.get(freq)) {
                if (i < k) {
                   ll.add(num);
                   i++;
                } else {
                    break;
                }
            }
            if (i >= k) break;
        }

        return ll;
    }
}
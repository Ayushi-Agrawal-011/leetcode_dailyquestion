class Solution {
    public String frequencySort(String s) {
            TreeMap<Character, Integer> map = new TreeMap<>();
         TreeMap<Integer, List<Character>> mp = new TreeMap<>(Collections.reverseOrder());

        for (char num : s.toCharArray()) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

		  for (char num : map.keySet()) {
            int freq = map.get(num);
            mp.putIfAbsent(freq, new ArrayList<>());
            mp.get(freq).add(num);
        }
StringBuilder sb=new StringBuilder();

		  for (int freq : mp.keySet()) {
            for (char num : mp.get(freq)) {
                for(int i=0;i<freq;i++){
             sb.append(num);
            }
            }  
        }

        return sb.toString();
    }
}
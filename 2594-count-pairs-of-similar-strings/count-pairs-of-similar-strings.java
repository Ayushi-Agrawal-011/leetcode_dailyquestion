class Solution {
    public int similarPairs(String[] words) {
          HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (String word : words) {
            int[] freq = new int[26];

            for (char ch : word.toCharArray()) {
                freq[ch - 'a'] = 1;
            }

            String key = Arrays.toString(freq);

            ans += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return ans;
    }
}
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        TreeMap<String, Integer> map = new TreeMap<>();
         TreeMap<Integer, List<String>> mp = new TreeMap<>(Collections.reverseOrder());
    for (int i = 0; i < senders.length; i++) {
            String sender = senders[i];
            String msg = messages[i];

            int words = msg.split(" ").length;  // count words in message
            map.put(sender, map.getOrDefault(sender, 0) + words);
        }

		  for (String num : map.keySet()) {
            int freq = map.get(num);
            mp.putIfAbsent(freq, new ArrayList<>());
            mp.get(freq).add(num);
        }

//         int i=0;
// 		  for (int freq : mp.keySet()) {
            
//           Collections.sort(mp.get(freq));
//           Collections.reverse(mp.get(freq));
//           String firstKey = map.firstKey();
// return firstKey;
//             }

        

//         return "";
int maxFreq = mp.firstKey();
        List<String> topSenders = mp.get(maxFreq);
        Collections.sort(topSenders); // sort alphabetically
        return topSenders.get(topSenders.size() - 1);
    }
}
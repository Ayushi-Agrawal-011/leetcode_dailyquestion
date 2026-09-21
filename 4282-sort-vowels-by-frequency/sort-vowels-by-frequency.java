class Solution {
    public String sortVowels(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            if(isVowel(ch))
                map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        TreeMap<Integer, List<Character>> freq =
            new TreeMap<>(Collections.reverseOrder());

        for(char ch : s.toCharArray()) {
            if(isVowel(ch) &&
               !freq.getOrDefault(map.get(ch), new ArrayList<>()).contains(ch)) {

                freq.putIfAbsent(map.get(ch), new ArrayList<>());
                freq.get(map.get(ch)).add(ch);
            }
        }
if(freq.isEmpty())
    return s;
        String sb = "";

        int f = freq.firstKey();
        int j = 0;

        for(char ch : s.toCharArray()) {

            if(!isVowel(ch)) {
                sb += ch;
            }
            else {
                char v = freq.get(f).get(j);
                sb += v;

                map.put(v, map.get(v) - 1);

                if(map.get(v) == 0) {
                    j++;

                    if(j == freq.get(f).size()) {
                        freq.remove(f);

                        if(!freq.isEmpty()) {
                            f = freq.firstKey();
                            j = 0;
                        }
                    }
                }
            }
        }

        return sb;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}
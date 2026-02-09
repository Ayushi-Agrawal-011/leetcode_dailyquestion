class Solution {
    public int rotatedDigits(int n) {
HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('2', '5');
        map.put('5', '2');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int c = 0;

        for (int i = 1; i <= n; i++) {

            String s = String.valueOf(i);
            StringBuilder rotated = new StringBuilder();
            boolean valid = true;

            for (char ch : s.toCharArray()) {
                if (!map.containsKey(ch)) {
                    valid = false;
                    break;
                }
                rotated.append(map.get(ch));
            }

            // GOOD number condition
            if (valid && !rotated.toString().equals(s)) {
                c++;
                // System.out.println(i + " " + rotated); // debug
            }
        }
        return c;
    }
}
class Solution {
    public int numSteps(String s) {
        int steps = 0;
        StringBuilder sb = new StringBuilder(s);

        while (!sb.toString().equals("1")) {
            int n = sb.length();

            // even number (ends with 0)
            if (sb.charAt(n - 1) == '0') {
                sb.deleteCharAt(n - 1); // divide by 2
            } 
            // odd number
            else {
                int i = n - 1;
                // handle carry
                while (i >= 0 && sb.charAt(i) == '1') {
                    sb.setCharAt(i, '0');
                    i--;
                }
                if (i < 0) {
                    sb.insert(0, '1');
                } else {
                    sb.setCharAt(i, '1');
                }
            }
            steps++;
        }
        return steps;
    }
}

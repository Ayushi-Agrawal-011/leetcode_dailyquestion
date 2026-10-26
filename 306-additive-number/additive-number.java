
import java.math.BigInteger;
import java.util.*;

class Solution {
    public boolean isAdditiveNumber(String num) {
        return fn(num, new ArrayList<>());
    }

    public boolean fn(String s, List<BigInteger> ll) {
        if (s.length() == 0) {
            return ll.size() >= 3;
        }

        for (int cut = 1; cut <= s.length(); cut++) {
            String t = s.substring(0, cut);

            if (t.length() > 1 && t.charAt(0) == '0')
                break;

            BigInteger curr = new BigInteger(t);
            int n = ll.size();

            if (n >= 2) {
                BigInteger sum = ll.get(n - 1).add(ll.get(n - 2));

                int cmp = curr.compareTo(sum);

                if (cmp < 0) continue;
                if (cmp > 0) break;
            }

            ll.add(curr);

            if (fn(s.substring(cut), ll))
                return true;

            ll.remove(ll.size() - 1);
        }

        return false;
    }
}

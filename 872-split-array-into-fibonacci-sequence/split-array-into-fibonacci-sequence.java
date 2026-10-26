class Solution {
    public List<Integer> splitIntoFibonacci(String s) {
       List<Integer> ll = new ArrayList<>();

        if (fn(s, ll)) {
            // int[] ans = new int[ll.size()];
            // for (int i = 0; i < ll.size(); i++) {
            //     ans[i] = ll.get(i);
            // }
            // return ans;
            return ll;
        }

        return new ArrayList<>();
    }

    public boolean fn(String s, List<Integer> ll) {
        if (s.length() == 0) {
            return ll.size() >= 3;
        }

        for (int cut = 1; cut <= s.length(); cut++) {
            String t = s.substring(0, cut);

            if (t.length() > 1 && t.charAt(0) == '0')
                break;

            long curr = Long.parseLong(t);

            if (curr > Integer.MAX_VALUE)
                break;

            int n = ll.size();

            if (n >= 2) {
                long sum = (long) ll.get(n - 1) + ll.get(n - 2);

                if (curr < sum) continue;
                if (curr > sum) break;
            }

            ll.add((int) curr);

            if (fn(s.substring(cut), ll))
                return true;

            ll.remove(ll.size() - 1);
        }

        return false;  
    }
}
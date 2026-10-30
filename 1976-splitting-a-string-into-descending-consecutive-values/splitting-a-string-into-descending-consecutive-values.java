// class Solution {
//     public boolean splitString(String s) {
//         List<Long> ll = new ArrayList<>();
//         return fn(s, ll);
//     }

//     public boolean fn(String s, List<Long> ll) {

//         if (s.length() == 0) {
//             return ll.size() >= 2;
//         }

//         for (int cut = 1; cut <= s.length(); cut++) {

//             String t = s.substring(0, cut);

//             if (t.length() > 1 && t.charAt(0) == '0')
//                 break;

//             long curr;

//             try {
//                 curr = Long.parseLong(t);
//             } 
//             catch (NumberFormatException e) {
//                 break;
//             }

//             int n = ll.size();

//             if (n >= 1) {
//                 long prev = ll.get(n - 1);

//                 if (curr != prev - 1) {
//                     if (curr < prev - 1)
//                         continue;
//                     break;
//                 }
//             }

//             ll.add(curr);

//             if (fn(s.substring(cut), ll))
//                 return true;

//             ll.remove(ll.size() - 1);
//         }

//         return false;
//     }
// }
class Solution {
    public boolean splitString(String s) {
        List<Long> ll = new ArrayList<>();
        return fn(s, ll);
    }

    public boolean fn(String s, List<Long> ll) {

        if (s.length() == 0) {
            return ll.size() >= 2;
        }

        for (int cut = 1; cut <= s.length(); cut++) {

            String t = s.substring(0, cut);

            long curr;

            try {
                curr = Long.parseLong(t);
            }
            catch (NumberFormatException e) {
                break;
            }

            int n = ll.size();

            if (n >= 1) {
                long prev = ll.get(n - 1);

                if (curr != prev - 1) {
                    if (curr < prev - 1)
                        continue;

                    break;
                }
            }

            ll.add(curr);

            if (fn(s.substring(cut), ll))
                return true;

            ll.remove(ll.size() - 1);
        }

        return false;
    }
}
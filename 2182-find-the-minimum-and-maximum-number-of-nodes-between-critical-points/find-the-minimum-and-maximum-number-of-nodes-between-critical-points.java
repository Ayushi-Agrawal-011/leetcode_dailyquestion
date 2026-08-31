class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        int[] ans = new int[2];
        Arrays.fill(ans, -1);

        int pos = 0;
        int first = -1;
        int last = -1;

        while (curr != null) {
            ListNode ahead = curr.next;

            if (prev != null && ahead != null &&
               ((prev.val < curr.val && curr.val > ahead.val) ||
                (prev.val > curr.val && curr.val < ahead.val))) {

                if (first == -1) {
                    first = pos;
                }
                else {
                    int dist = pos - last;

                    if (ans[0] == -1)
                        ans[0] = dist;
                    else
                        ans[0] = Math.min(ans[0], dist);
                }

                last = pos;
            }

            prev = curr;
            curr = curr.next;
            pos++;
        }

        if (first != -1 && first != last) {
            ans[1] = last - first;
        }

        return ans;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
          while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        fast= reverseList(slow.next);
        slow.next = null;
slow=head;
int i=0;
while(fast!=null) {
    ListNode p=slow.next;
    ListNode q=fast.next;
    slow.next=fast;
    fast.next=p;
    slow=p;
    fast=q;
}
     
    }
    public ListNode reverseList(ListNode head) {
	        ListNode curr=head;
	        ListNode prev=null;
	        while(curr!=null){
	            ListNode ahead=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=ahead;
	        }
	        return prev;
	    }
	}

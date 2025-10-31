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
    public boolean isPalindrome(ListNode head) {
ListNode meet=middleNode(head);
ListNode x=reverseList(meet);
ListNode y=head;
while(x!=null && y!=null){
    if(x.val!=y.val)
    return false;
    x=x.next;
    y=y.next;
}
return true;

    }
        public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
       public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode temp=head;
        while(curr!=null){
            ListNode ahead=curr.next;
            curr.next=prev;
          
            prev=curr;
            curr=ahead;

        }
        return prev;
        
    }
    
}
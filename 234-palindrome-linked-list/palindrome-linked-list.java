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
     System.out.println(meet.val);
    ListNode k= reverseList(meet);
  ListNode p=head;
     while(k!=null){
        if(k.val!=p.val){
            return false;
        }
        k=k.next;
        p=p.next;
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
	        while(curr!=null){
	            ListNode ahead=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=ahead;
	        }
	        return prev;
	    }
	
}
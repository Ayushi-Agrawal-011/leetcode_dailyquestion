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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp=head;
    ListNode dummy=head;
    int c=0;
   while(temp!=null){
    temp=temp.next;
    c++;
   }
     n=c-n;
      if(n==0)
          return head.next;
     while(n-->1){
        dummy=dummy.next;
     }

     ListNode k=dummy.next;
     dummy.next=k.next;
     k.next=null;
     return head;


    }
    
}
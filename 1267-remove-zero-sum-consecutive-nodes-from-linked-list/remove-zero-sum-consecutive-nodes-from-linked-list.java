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
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null)
        return null;
        int sum=0;
ListNode r=head;
while(r!=null){
    sum+=r.val;
    if(sum==0){
        head=r.next;
    }
    r=r.next;
}
if(head!=null)
head.next=removeZeroSumSublists(head.next);
return head;
    }
}
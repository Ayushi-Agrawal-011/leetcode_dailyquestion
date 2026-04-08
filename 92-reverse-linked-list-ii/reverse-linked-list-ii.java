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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        List<Integer> ll=new ArrayList<>();
        while(head!=null){
            ll.add(head.val);
            head=head.next;
        }
        int i=0;
        
        while(i<ll.size()){
            
            if(i>=left-1 && i<=right-1){
           dummy.next=new ListNode(ll.get(left + right - i - 2));
           dummy=dummy.next;
            }
            else{
 dummy.next=new ListNode(ll.get(i));
           dummy=dummy.next;
            }
            i++;
        }
        return temp.next;
    }
}
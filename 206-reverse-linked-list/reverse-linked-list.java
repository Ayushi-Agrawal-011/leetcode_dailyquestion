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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
  int c=0;
        while(curr!=null){
            curr=curr.next;
       c++;

        }
        ListNode tp=GetNode(c-1,head);
        ListNode p=tp;
        for(int i=c-2;i>=0;i--){
            ListNode nn=new ListNode();
		nn.val=GetNode(i,head).val;
		p.next=nn;
		
		p=nn;
        }
    
        return tp;
    }
    private ListNode GetNode(int k,ListNode head) {

	ListNode temp=head;
	for(int i=0;i<k;i++) {
		temp=temp.next;
	}
	return temp;
}
  

}
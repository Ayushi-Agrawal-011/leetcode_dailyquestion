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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode [] ans =new ListNode[k];
        int n=fn(head);
       
        int extra=n%k;
        int rem=n/k;
        int i=0;
        while(head!=null && i < k){
            ListNode nn=new ListNode();
    ListNode temp=nn;
int size = rem;
int c=0;
            if (extra > 0) {
                size++;
                extra--;
            }
    while(c<size){
    nn.next=new ListNode(head.val);
    head=head.next;
    nn=nn.next;
    c++;
    }
    ans[i]=temp.next;
    i++;
        }
        return ans;
    }
    public int fn(ListNode head){
        int n=0;
 while(head!=null){
            head=head.next;
            n++;
        }
        return n;
    }
}
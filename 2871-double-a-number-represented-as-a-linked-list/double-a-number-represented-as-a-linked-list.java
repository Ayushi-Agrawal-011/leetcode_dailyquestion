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
 import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        BigInteger no=new BigInteger(s);
        no=no.multiply(BigInteger.valueOf(2)); 
        String p=no.toString();
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int i=0;i<p.length();i++){
            temp.next=new ListNode(p.charAt(i)-'0');
            temp=temp.next;
        }
        return dummy.next;

    }
}
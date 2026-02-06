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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1="";
        String s2="";
        while(l1!=null){
            s1+=l1.val;
            l1=l1.next;
        }
        while(l2!=null){
            s2+=l2.val;
            l2=l2.next;
        }
        BigInteger a=new BigInteger(s1);
        BigInteger b=new BigInteger(s2);
        BigInteger c=a.add(b);
        String s=c.toString();
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        for(int i=0;i<s.length();i++){
            temp.next=new ListNode(s.charAt(i)-'0');
            temp=temp.next;
        }
return dummy.next;
    }
}
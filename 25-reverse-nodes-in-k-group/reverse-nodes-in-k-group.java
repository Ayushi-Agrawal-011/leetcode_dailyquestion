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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode []ans=splitListToParts(head,k);
        ListNode res=new ListNode();
        ListNode temp=res;
        for(ListNode r:ans){
            int c = 0;
            ListNode x = r;

            while (x != null) {
                c++;
                x = x.next;
            }

            if (c == k) {
                temp.next = reverseList(r);
            } else {
                temp.next = r;
            }

            while (temp.next != null) {
                temp = temp.next;
            }

        }
return res.next;
    }
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
  

     public ListNode[] splitListToParts(ListNode head, int k) {
        
        int n=fn(head);
         int groups = (n + k - 1) / k;
   // int rem=n/k;
   ListNode[] ans = new ListNode[groups];
        int i=0;
        while(head!=null && i < groups){
            ListNode nn=new ListNode();
    ListNode temp=nn;
int size = k;
int c=0;
   while (c < size && head != null) {
            nn.next = new ListNode(head.val);
            head = head.next;
            nn = nn.next;
            c++;
        }

        ans[i] = temp.next;
     
  
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
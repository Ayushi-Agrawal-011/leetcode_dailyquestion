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
    public int[] nextLargerNodes(ListNode head) {
     List<Integer> ll=new ArrayList<>();
     while(head!=null){
        ll.add(head.val);
        head=head.next;
     }
     int n=ll.size();
        int[]ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ll.size();i++){
            while(!st.isEmpty() &&ll.get(i)>ll.get(st.peek())){
                ans[st.pop()]=ll.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}
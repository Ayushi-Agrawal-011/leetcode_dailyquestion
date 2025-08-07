/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        
    List<List<Integer>> ans=new ArrayList<>();
             if(root==null)
              return -1;
      
        List<Long> ll=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();//use linked list as queue
    q.add(root);//addLast
	while(!q.isEmpty()) {
        int size=q.size();
        long sum=0;
        for(int i=0;i<size;i++){
		TreeNode n=q.poll();//removeFirst
	  sum+=n.val;
		if(n.left!=null) {
			q.add(n.left);
		}
		if(n.right!=null) {
			q.add(n.right);
		}}
         ll.add(sum);
     
       
	} 
      if (k > ll.size()) return -1; 
    ll.sort(Collections.reverseOrder());
    return ll.get(k-1);


    }
    
}
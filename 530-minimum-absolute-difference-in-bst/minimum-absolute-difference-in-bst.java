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
    public int getMinimumDifference(TreeNode root) {
        return inorderTraversal(root);
    }
    public int inorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        INOrder(root,ll);
        Collections.sort(ll);
  
       int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < ll.size(); i++) {
            minDiff = Math.min(minDiff, ll.get(i) - ll.get(i - 1));
        }
        return minDiff;
    }
    public static void INOrder(TreeNode nn,List<Integer> ll) {
		if(nn==null) {
			return;
		}
   
		INOrder(nn.left,ll);
             ll.add(nn.val);
					
		INOrder(nn.right,ll);
	}
}
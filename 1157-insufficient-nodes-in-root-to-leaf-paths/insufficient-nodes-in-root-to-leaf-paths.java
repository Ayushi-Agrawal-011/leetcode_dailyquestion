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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
         return hasPathSum(root,limit,0);
    }
        public TreeNode hasPathSum(TreeNode root, int limit,int sum) {
	        if(root==null)
	        return null;
	       if(root.left==null && root.right==null){
	        if(sum+root.val<limit)
            return null;
            return root;
	       }  
	       root.left=hasPathSum(root.left,limit,sum+root.val);
	        root.right=hasPathSum(root.right,limit,sum+root.val);
            if(root.left == null && root.right == null) return null;
	        return root;
	    }
}
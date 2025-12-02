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
  
    public void flatten(TreeNode result) {
      MakeLL(result);
    }
    public TreeNode MakeLL(TreeNode root){
     if(root==null)
     return null;
     if(root.left==null && root.right==null)
     return root;
     TreeNode left=MakeLL(root.left);
     TreeNode right=MakeLL(root.right);
     if(root.left!=null){
        left.right=root.right;
        root.right=root.left;
        root.left=null;
     }
     if(right!=null)
     return right;
     return left;
    }
}
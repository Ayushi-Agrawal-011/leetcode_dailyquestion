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
 class BSTPair{
long maxi=Long.MIN_VALUE;

long mini=Long.MAX_VALUE;
boolean isbal=true;
 }
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root).isbal;
    }
    public BSTPair helper(TreeNode root) {
     if(root==null)
     return new BSTPair();
     BSTPair ldp=helper(root.left);
     BSTPair rdp=helper(root.right);
     BSTPair sdp=new BSTPair();
     sdp.maxi=Math.max(ldp.maxi,Math.max(rdp.maxi,root.val));
     sdp.mini=Math.min(ldp.mini,Math.min(rdp.mini,root.val));
     sdp.isbal=ldp.isbal && rdp.isbal && ldp.maxi<root.val && rdp.mini>root.val;
     return sdp;
}
}
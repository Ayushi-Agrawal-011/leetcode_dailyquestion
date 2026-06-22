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
    public boolean isBalanced(TreeNode root) {
       return fn(root).isbal;
    }
    public Pair fn(TreeNode root) {
       if(root==null)
       return new Pair();
       Pair ldp=fn(root.left);
       Pair rdp=fn(root.right);
       Pair sdp=new Pair();
       sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
       sdp.isbal=ldp.isbal && rdp.isbal && Math.abs(ldp.ht-rdp.ht)<=1;
       return sdp;
    }
    class Pair{
        boolean isbal=true;
        int ht=-1;
    }
}
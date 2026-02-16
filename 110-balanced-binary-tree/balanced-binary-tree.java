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
    public DiaPair fn(TreeNode root){
        if(root==null)
        return new DiaPair();
        DiaPair ldp=fn(root.left);
        DiaPair rdp=fn(root.right);
        DiaPair sdp=new DiaPair();
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        boolean sb=Math.abs(ldp.ht-rdp.ht)<=1;
        sdp.isbal=ldp.isbal && rdp.isbal && sb;
        return sdp;
    }
    class DiaPair{
        int ht=-1;
        boolean isbal=true;
    }
}
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
    public int diameterOfBinaryTree(TreeNode root) {
        return fn(root).dt;
    }

 public Pair fn(TreeNode root) {
       if(root==null)
       return new Pair();
       Pair ldp=fn(root.left);
       Pair rdp=fn(root.right);
       Pair sdp=new Pair();
       sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
       int sb=ldp.ht+rdp.ht+2;
      sdp.dt=Math.max(ldp.dt,Math.max(rdp.dt,sb));
      return sdp;
    }
    class Pair{
       
        int ht=-1;
        int dt=0;
    }}
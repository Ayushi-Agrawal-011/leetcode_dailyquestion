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
    int maxd=0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
     return r(root);
    }
    public TreeNode r(TreeNode root){
        if(root==null)
        return null;
        int lh=ht(root.left);
        int rh=ht(root.right);
        if(lh>rh)
        return r(root.left);
        else if(rh>lh)
        return r(root.right);
        return root;
    }
    public int ht(TreeNode root){
        if(root==null)
        return -1;
        int lmax=ht(root.left);
        int rmax=ht(root.right);
        return Math.max(lmax,rmax)+1;
    }
}
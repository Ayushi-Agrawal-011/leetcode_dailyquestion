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
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        s(root.left,root.val,-1);
        s(root.right,root.val,-1);
        return sum;

    }
    public void s(TreeNode root,int p,int gp){
   if(root==null)
   return;
   if(gp%2==0)
   sum+=root.val;
    s(root.left,root.val,p);
        s(root.right,root.val,p);
    }
}
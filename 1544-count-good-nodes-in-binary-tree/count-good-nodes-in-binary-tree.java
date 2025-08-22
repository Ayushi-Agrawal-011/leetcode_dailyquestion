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
    int c=0;
    public int goodNodes(TreeNode root) {
    s(root,root.val )  ;
      return c;
    }
    public void s(TreeNode root,int x){
        if(root==null)
        return ;
        if(root.val>=x){
            c++;
        }
       
       
        s(root.left,Math.max(x,root.val));
     
      s(root.right,Math.max(x,root.val));
         
    }
}
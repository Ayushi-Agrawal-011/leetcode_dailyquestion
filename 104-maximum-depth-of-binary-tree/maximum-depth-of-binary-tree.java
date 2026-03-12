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
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
       return fn(root,1);
    }
    public int fn(TreeNode root,int cl){
        if(root==null)
        return 0 ;
        
     int a=   fn(root.left,cl+1);
     int b=   fn(root.right,cl+1);
     return Math.max(a,b)+1;
    }

}
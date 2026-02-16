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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        fn(root);
        return ans;
    }
    public int fn(TreeNode root){
        if(root==null)
        return Integer.MIN_VALUE;
        int left=Math.max(0,fn(root.left));
        int right=Math.max(0,fn(root.right));
        ans=Math.max(ans,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}
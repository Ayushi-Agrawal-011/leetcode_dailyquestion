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
    public boolean hasPathSum(TreeNode root, int targetSum) {
    return   fn(root,targetSum); 
    }

    public boolean fn(TreeNode root,int sum){
        if(root==null)
        return false;
      
        if(root.left==null && root.right==null){
            sum-=root.val;
            return sum==0;
        }
        boolean a=fn(root.left,sum-root.val);
        boolean b=fn(root.right,sum-root.val);
        return a||b;
    }
}
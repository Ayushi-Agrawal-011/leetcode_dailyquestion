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
        return fn(root,targetSum,0);
    }
    public boolean fn(TreeNode root,int target,int curr){
        if(root==null)
        return false ;
        if(root.left ==null && root.right==null){
            curr+=root.val;
            if(curr==target){
                return true;
            }
        }
        boolean left=fn(root.left,target,curr+root.val);
        boolean right=fn(root.right,target,curr+root.val);
        return left ||  right;
    }
}
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
    int ans=0;
    public int longestUnivaluePath(TreeNode root) {
        int a= fn(root,-1);
        return ans;
        
    }
    public int fn(TreeNode root,int parent){
        if(root==null)
        return 0;
        int left=fn(root.left,root.val);
        int right=fn(root.right,root.val);
        ans=Math.max(left+right,ans);
      return  parent==root.val?Math.max(left,right)+1:0;
    }
}
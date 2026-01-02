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
    public int sumNumbers(TreeNode root) {
return  hasPathSum(root,0);
        
    }
    public static int hasPathSum(TreeNode root,int sum1){
      if(root==null){
        return 0;
    }
    if(root.left==null && root.right==null){
        return sum1*10+root.val;
    }
   
  int left= hasPathSum(root.left,root.val+sum1*10);
     int right= hasPathSum(root.right,root.val+sum1*10);
     return left+ right;
    }
}
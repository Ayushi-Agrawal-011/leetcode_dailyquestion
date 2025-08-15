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
   long ans=0,total=0;
    public int maxProduct(TreeNode root) {
        total=s(root);
        s(root);
       return (int) (ans % (1e9+7));
        
    }
    public int s(TreeNode root){
        if(root==null)
        return 0;
        int curr=s(root.left)+s(root.right)+root.val;
        ans=Math.max(ans,(total-curr)*curr);
        return curr;
    }

}
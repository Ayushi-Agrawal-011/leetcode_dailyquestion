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
       fn(root,1);
       return maxd;
    }
    public void fn(TreeNode root,int cl){
        if(root==null)
        return ;
        if(cl>maxd){
            maxd=cl;
            //cl++;
        }
        fn(root.left,cl+1);
        fn(root.right,cl+1);
    }

}
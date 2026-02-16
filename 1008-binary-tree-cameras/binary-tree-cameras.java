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
    int camera=0;
    public int minCameraCover(TreeNode root) {
     int ans=  fn(root);
        if(ans==-1)
        camera++;
        return camera;
    }
    public int fn(TreeNode root){
        if(root==null)
        return 0;
       int left=fn(root.left);
      int right=fn(root.right);
        if(left==-1 || right==-1){
          camera++;
            return 1;
        }
        if(left==1 || right ==1 ){
            return 0;
        }
        if(left==0 && right==0)
        return -1;
        return -1;

    }
}
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
      int maxd = 0;
     int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
        return 0;
          r(root,0);
          return sum;
    }
        public void r(TreeNode root,int cl){
            
        if(root==null)
        return;
    
        if(maxd<cl){
         sum=0;
         maxd=cl;
        }
       if(cl==maxd)
       sum+=root.val;
           r(root.left,cl+1);
       r(root.right,cl+1);
   
    }
}
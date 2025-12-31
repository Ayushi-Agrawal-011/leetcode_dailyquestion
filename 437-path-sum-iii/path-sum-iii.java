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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
       if(root==null)
       return 0;
  
          hasPathSum(root, targetSum, 0);
      

        // paths starting from left & right subtrees
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
        
      

    }
    	    public void hasPathSum(TreeNode root, int targetSum,long csum) {
	        if(root==null)
	        return ;
            
      csum += root.val;
        if (csum == targetSum) count++;

    
        hasPathSum(root.left, targetSum, csum);
        hasPathSum(root.right, targetSum, csum);
	
           
	    }
}
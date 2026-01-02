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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        hasPathSum(root,targetSum,res,ll);
        return res;

    }
    	    public void hasPathSum(TreeNode root, int targetSum,List<List<Integer>> res,List<Integer> ll) {
	        if(root==null)
	        return ;
            ll.add(root.val);
	       if(root.left==null && root.right==null &&targetSum-root.val==0){
	        res.add(new ArrayList<>(ll));
	       }  
	     hasPathSum(root.left,targetSum-root.val,res,ll);
	        hasPathSum(root.right,targetSum-root.val,res,ll);
	    ll.remove(ll.size()-1);
	    }
	
}
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
 class DiaPair{
 boolean isbal=true;
    int ht=-1;

}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return diameter(root).isbal;
    }
    
	public DiaPair diameter(TreeNode root) {
		if(root==null){
    return new DiaPair();}
    DiaPair ldp=diameter(root.left);
    DiaPair rdp=diameter(root.right);
    DiaPair sdp=new DiaPair();
    sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
    boolean sd=Math.abs(ldp.ht-rdp.ht)<=1;
    sdp.isbal=ldp.isbal && rdp.isbal && sd;
return sdp;
		
	}
	

}
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
    public int maxSumBST(TreeNode root) {
        return helper(root).ans;
    }
     public BSTPair helper(TreeNode root) {
	        if(root==null){
	            return new BSTPair();
	        }
	     
	        BSTPair ldp=helper(root.left);
	          BSTPair rdp=helper(root.right);
	            BSTPair sdp=new  BSTPair();
	            sdp.max=Math.max(ldp.max,Math.max(rdp.max,root.val));
	            sdp.min=Math.min(ldp.min,Math.min(rdp.min,root.val)) ;
                sdp.sum=ldp.sum+rdp.sum+root.val;
	            sdp.isBST=ldp.isBST && rdp.isBST && ldp.max<root.val && rdp.min>root.val;
                if(sdp.isBST)
                sdp.ans=Math.max(ldp.ans,Math.max(rdp.ans,sdp.sum));
                else
                sdp.ans=Math.max(ldp.ans,rdp.ans);
	         return sdp;
	}
	class BSTPair{
	    long min=Long.MAX_VALUE;
	     long max=Long.MIN_VALUE;
	     boolean isBST=true;
         int sum=0;//bt ka sum
         int ans=0;// max bst part ka sum
	}
}
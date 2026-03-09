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
    public boolean isValidBST(TreeNode root) {
        
   
        return fn(root).isbst;
    }
    public BstPair fn(TreeNode root){
        if(root==null)
        return new BstPair();
        BstPair ldp=fn(root.left);
        BstPair rdp=fn(root.right);
        BstPair sdp=new BstPair();
       sdp.min=Math.min(ldp.min,Math.min(rdp.min,root.val));
       sdp.max=Math.max(ldp.max,Math.max(rdp.max,root.val));
       sdp.isbst=ldp.isbst && rdp.isbst && ldp.max<root.val && root.val<rdp.min;
       return sdp;
    }
    class BstPair{
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
      boolean isbst=true;
    }
}
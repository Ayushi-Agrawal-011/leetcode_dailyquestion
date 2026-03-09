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
        
      return fn(root).ans;
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
       sdp.sum=ldp.sum+rdp.sum+root.val;
       if(sdp.isbst)
       sdp.ans=Math.max(ldp.ans,Math.max(rdp.ans,sdp.sum));
       else
       sdp.ans=Math.max(ldp.ans,rdp.ans);
       return sdp;
    }
    class BstPair{
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
    int sum=0;
    int ans=0;
      boolean isbst=true;
    }
}
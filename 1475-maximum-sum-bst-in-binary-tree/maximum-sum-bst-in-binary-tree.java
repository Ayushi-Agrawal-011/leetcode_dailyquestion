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
    public Pair fn(TreeNode root){
        if(root==null)
        return new Pair();
        Pair ldp=fn(root.left);
        Pair rdp=fn(root.right);
Pair sdp=new Pair();
sdp.max=Math.max(root.val,Math.max(ldp.max,rdp.max));
sdp.min=Math.min(root.val,Math.min(ldp.min,rdp.min));
sdp.isbst=ldp.isbst && rdp.isbst && ldp.max<root.val && root.val<rdp.min;
sdp.sum=ldp.sum+rdp.sum+root.val;
if(sdp.isbst)
sdp.ans=Math.max(ldp.ans,Math.max(rdp.ans,sdp.sum));
else
sdp.ans=Math.max(ldp.ans,rdp.ans);
return sdp;
    }
    class Pair{
        boolean isbst=true;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        int sum=0;
        int ans=0;
    }
}
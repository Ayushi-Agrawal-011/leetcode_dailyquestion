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
    public DiaPair fn(TreeNode root){
 if(root==null)
        return new DiaPair();
        DiaPair ldp=fn(root.left);
        DiaPair rdp=fn(root.right);
        DiaPair sdp=new DiaPair();
        sdp.min=Math.min(ldp.min,Math.min(rdp.min,root.val));
        sdp.max=Math.max(ldp.max,Math.max(rdp.max,root.val));
        sdp.sum=ldp.sum+rdp.sum+root.val;
        sdp.isbst=ldp.isbst && rdp.isbst && ldp.max<root.val && root.val<rdp.min;
        if(sdp.isbst){
            sdp.ans=Math.max(ldp.ans,Math.max(rdp.ans,sdp.sum));

        }
        else
        sdp.ans=Math.max(ldp.ans,rdp.ans);
        return sdp;
        
    }
    class DiaPair{
        boolean isbst=true;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int ans=0;
    }
}
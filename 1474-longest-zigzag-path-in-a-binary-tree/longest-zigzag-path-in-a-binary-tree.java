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
    public int longestZigZag(TreeNode root) {
        return fn(root).ans;
    }
    public Pair fn(TreeNode root){
if(root==null)
return new Pair();

Pair ldp=fn(root.left);
Pair rdp=fn(root.right);
Pair sdp=new Pair();
sdp.left = ldp.right + 1;
 sdp.right = rdp.left + 1;
sdp.ans = Math.max(Math.max(ldp.ans, rdp.ans),
                           Math.max(sdp.left, sdp.right));

        return sdp;
    }
    class Pair{
       
         int left = -1;
        int right = -1;
        int ans = 0;
    }
}
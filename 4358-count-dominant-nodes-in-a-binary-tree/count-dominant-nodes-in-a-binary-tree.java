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
    int c=0;
    public int countDominantNodes(TreeNode root) {
        Pair p=fn(root);
        return c;
    }
    public Pair fn(TreeNode root){
        if(root==null)
        return new Pair();
        Pair ldp=fn(root.left);
        Pair rdp=fn(root.right);
        Pair sdp=new Pair();
        sdp.val=root.val;
        sdp.max=Math.max(ldp.max,Math.max(rdp.max,root.val));
        if(sdp.max==root.val){
        c++;
        System.out.println(root.val);
        }
        return sdp;
    }
    class Pair{        
        int val;
        int max=Integer.MIN_VALUE;
       
    }
}
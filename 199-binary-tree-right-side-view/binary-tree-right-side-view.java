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
    int maxd=0;
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ll=new ArrayList<>();
rs(root,1,ll);
    return ll;
    }
    public void rs(TreeNode root,int cl,List<Integer> ll){
        if(root==null)
        return;
        if(cl>maxd){
          ll.add(root.val);
          maxd=cl;
        }
        rs(root.right,cl+1,ll);
          rs(root.left,cl+1,ll);
    }
}
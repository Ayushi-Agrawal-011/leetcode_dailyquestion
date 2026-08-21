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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> l1=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();
    fn(root1,l1);
    fn(root2,l2);
    if(l1.equals(l2))
    return true;
    return false;    
    }
    public void fn(TreeNode root,List<Integer> ll){
        if(root==null)
        return ;
        if(root.left==null && root.right==null){
            ll.add(root.val);
            return;

        }
        if(root.left!=null)
        fn(root.left,ll);
        if(root.right!=null)
        fn(root.right,ll);

    }

}
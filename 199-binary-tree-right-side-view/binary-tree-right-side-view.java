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
        List<Integer>  ans=new ArrayList<>();
        fn(root,1,ans);
        return ans;
    }
    public void fn(TreeNode root,int cl,List<Integer> ans){
        if(root==null)
        return;
        if(maxd<cl){
            ans.add(root.val);
            maxd=cl;
        }
                fn(root.right,cl+1,ans);
        fn(root.left,cl+1,ans);

    }
}
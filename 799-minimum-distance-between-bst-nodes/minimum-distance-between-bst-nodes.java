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
    public int minDiffInBST(TreeNode root) {
     List<Integer> ll=new ArrayList<>();
     fn(root,ll);
     int ans=Integer.MAX_VALUE;
     Collections.sort(ll);
     for(int i=1;i<ll.size();i++){
        ans=Math.min(ans,Math.abs(ll.get(i)-ll.get(i-1)));
     }
 ;
     return ans;
    }
void fn(TreeNode root,List<Integer>ll) {
    if (root == null)
        return;

    ll.add(root.val);
    fn(root.left,ll);
   fn(root.right,ll);
}
}
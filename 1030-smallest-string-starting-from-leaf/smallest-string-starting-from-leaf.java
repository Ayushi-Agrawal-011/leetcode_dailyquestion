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
    public String smallestFromLeaf(TreeNode root) {
      List<String> ll=new ArrayList<>();  
      p(root,ll,new StringBuilder());
      Collections.sort(ll);
      return ll.get(0);
    }
  public void p(TreeNode root,List<String> ll,StringBuilder ans){
    if(root==null)
    return;
        if(root.left==null && root.right==null){
      ans.append((char)(97+root.val));
   ll.add(ans.reverse().toString());
   return;
        }

        p(root.left,ll,new StringBuilder(ans).append((char)(97+root.val)));
        p(root.right,ll,new StringBuilder(ans).append((char)(97+root.val)));
        return ;
    }
}
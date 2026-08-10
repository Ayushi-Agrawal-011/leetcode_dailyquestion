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
    List<Integer> ans=new ArrayList<>();
    int i=0;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
 if(!fn(root,voyage)){
    ans.clear();
 ans.add(-1);
 }
 return ans;

    }
    public boolean fn(TreeNode root,int[]voyage){
        if(root==null)
        return true;
        if(i >= voyage.length ||voyage[i]!=root.val)
        return false;
        i++;
        if(root.left !=null &&  i < voyage.length &&root.left.val!=voyage[i]){
ans.add(root.val);
return fn(root.right, voyage) && fn(root.left, voyage);

        }
        return fn(root.left,voyage) && fn(root.right,voyage);

    }
}
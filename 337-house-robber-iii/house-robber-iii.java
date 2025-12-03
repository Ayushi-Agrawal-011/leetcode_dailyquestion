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

       public int rob(TreeNode root) {
        return r(root, new HashMap<>());
    }
    public int r(TreeNode root,HashMap<TreeNode,Integer>map){
        if(root==null)
        return 0;
        if(map.containsKey(root))
        return map.get(root);
        int ans=0;
       if(root.left!=null){
        ans+=r(root.left.left,map)+r(root.left.right,map);}
         if(root.right!=null){
        ans+=r(root.right.left,map)+r(root.right.right,map);}
        ans=Math.max(ans+root.val,r(root.left,map)+r(root.right,map));
        map.put(root,ans);
       
       
        return ans; 
    }
    
}
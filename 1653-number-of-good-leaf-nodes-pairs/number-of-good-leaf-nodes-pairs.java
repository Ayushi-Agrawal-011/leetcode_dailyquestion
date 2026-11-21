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
    int ans=0;
    public int countPairs(TreeNode root, int distance) {
         makeParent(root, null);
     fn(root,distance);   
     return ans/2;
    }
    public void fn(TreeNode  root,int distance){
        if(root==null)
        return;
        if(root.left==null && root.right==null){
            dfs(root,distance,root,0,new HashSet<>());
        }
        fn(root.left,distance);
        fn(root.right,distance);
    }
    public void dfs(TreeNode root,int distance,TreeNode curr,int d,HashSet<TreeNode> vis){
  if (curr == null || d > distance || vis.contains(curr))
            return;

        vis.add(curr);

        if (curr.left == null && curr.right == null && curr != root) {
            ans++;
            return;
        }

        dfs(root, distance, curr.left, d + 1, vis);
        dfs(root, distance, curr.right, d + 1, vis);
        dfs(root, distance, map.get(curr), d + 1, vis);
    }
    HashMap<TreeNode, TreeNode> map = new HashMap<>();

public void makeParent(TreeNode root, TreeNode parent) {
    if (root == null)
        return;

    map.put(root, parent);

    makeParent(root.left, root);
    makeParent(root.right, root);
}
}
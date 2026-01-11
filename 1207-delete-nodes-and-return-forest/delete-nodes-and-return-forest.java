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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    if(root==null)
    return new ArrayList<>();
    List<TreeNode> forest=new ArrayList<>();
    Set<Integer> p=new HashSet<>();
    for(int b:to_delete){
        p.add(b);
    }
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        TreeNode cur=q.poll();
        if(cur.left!=null){
            q.add(cur.left);
            if(p.contains(cur.left.val))
            cur.left=null;
        }
          if(cur.right!=null){
            q.add(cur.right);
            if(p.contains(cur.right.val))
            cur.right=null;
        }
       if(p.contains(cur.val)){
         if(cur.left!=null){
            forest.add(cur.left);
         }
          if(cur.right!=null){
            forest.add(cur.right);
         }
       }
        
    }
     if(!p.contains(root.val))
        forest.add(root);
    return forest;
    }
}
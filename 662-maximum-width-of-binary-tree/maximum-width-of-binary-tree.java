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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            Pair si=q.peek();
            Pair end=null;
            for(int i=0;i<size;i++){
                end=q.poll();
              if(end.node.left!=null){
              q.add(new Pair(end.node.left,2*end.idx+1));  
            }
            if(end.node.right!=null){
              q.add(new Pair(end.node.right,2*end.idx+2));  
            }

            }
            ans=Math.max(ans,end.idx-si.idx+1);
        }
        return ans;
    }
    class Pair{TreeNode node;
	        int idx;
	        public Pair(TreeNode node,int idx){
	            this.idx=idx;
	            this.node=node;
	        }
	    }
}
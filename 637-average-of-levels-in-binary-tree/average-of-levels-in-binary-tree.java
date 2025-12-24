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
    public List<Double> averageOfLevels(TreeNode root) { List<List<Integer>> ll=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();//use linked list as queue
	q.add(root);//addLast
    List<Double> res=new ArrayList<>();
	while(!q.isEmpty()) {
		
         int size = q.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
  TreeNode n = q.poll();
                sum += n.val;
	
		if(n.left!=null) {
            
			q.add(n.left);
		}
		if(n.right!=null) {
            
			q.add(n.right);
		}
       
        }
      res.add((double)sum/size);
	

 
   
     
    }
    return res;
        
    }
    public void LevelOrder() {
	
}
}
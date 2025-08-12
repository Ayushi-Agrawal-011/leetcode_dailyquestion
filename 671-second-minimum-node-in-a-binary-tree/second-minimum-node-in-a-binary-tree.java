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
    public int findSecondMinimumValue(TreeNode root) {
     INOrder(root);
Collections.sort(ans);
     int a=ans.removeFirst();
     while(ans.size()>0 && ans.get(0)==a){
        ans.removeFirst();
     }
     if(ans.size()>0)
     return ans.get(0);
     return -1;
    }
   
     

    
    public  void INOrder(TreeNode nn){
        	if(nn==null) {
		return;
	}
			
		if(nn.left!=null)	
            INOrder(nn.left);
            ans.add(nn.val);
      if(nn.right!=null)      
	INOrder(nn.right);
    }
}
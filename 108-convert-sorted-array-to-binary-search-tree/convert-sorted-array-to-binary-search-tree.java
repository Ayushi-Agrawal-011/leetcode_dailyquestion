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
   
 private TreeNode root;
    public TreeNode sortedArrayToBST(int[] arr) {
      return  root=CreateTree(arr,0,arr.length-1);
    }
    private TreeNode CreateTree(int []arr,int si,int ei) {
	 if(si>ei)
		 return null;
	 int mid=(si+ei)/2;

	 TreeNode nn=new TreeNode();
	 nn.val=arr[mid];
	 System.out.print(nn.val+"-->");
	 nn.left=CreateTree(arr,si,mid-1);
	 nn.right=CreateTree(arr,mid+1,ei);
	 return nn;
	 
 }
}
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return  CreateTree(nums,0,nums.length-1);

    }
    public TreeNode CreateTree(int []arr,int si,int ei) {
	 if(si>ei)
		 return null;
	

	 TreeNode nn=new TreeNode();
     int mid=max(arr,si,ei);
	 nn.val=arr[mid];
	 System.out.print(nn.val+"-->");
	 nn.left=CreateTree(arr,si,mid-1);
	 nn.right=CreateTree(arr,mid+1,ei);
	 return nn;
 }
 public static int max(int []arr,int i,int j) {
		int maximum=arr[i];

        int e=i;
		for(int k=i+1;k<=j;k++) {
            if(arr[k]>maximum){
			maximum=Math.max(maximum, arr[k]);
            e=k;
            }
			
		}
		return e;
	}
}
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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
 return  fn(preorder,postorder,0,preorder.length-1,0,postorder.length-1);   
    }
    public TreeNode fn(int[]pre,int[]post,int plo,int phi,int pslo,int pshi){
               if (plo > phi)
            return null;

        TreeNode nn=new TreeNode(pre[plo]);
      if (plo == phi)
            return nn;
        
        int idx=search(post,pslo,pshi,pre[plo+1]);
        int c=idx-pslo+1;
        nn.left=fn(pre,post,plo+1,plo+c,pslo,idx);
        nn.right=fn(pre,post,plo+c+1,phi,idx+1,phi-1);
        return nn;
      
    }
    public int search(int[] arr, int l, int r, int target) {
    for(int i=l; i<=r; i++) {
        if(arr[i] == target)
            return i;
    }
    return -1;
}
}
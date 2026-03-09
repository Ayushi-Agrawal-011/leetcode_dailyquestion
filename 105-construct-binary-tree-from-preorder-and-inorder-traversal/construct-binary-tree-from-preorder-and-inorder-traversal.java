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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      return fn(preorder,inorder,0,preorder.length-1,0,inorder.length-1);  
    }
    public TreeNode fn(int[]pre,int[]in,int plo,int phi,int ilo,int ihi){
      if(ilo>ihi || plo>phi)
      return null;
      TreeNode nn=new TreeNode(pre[plo]);
      int idx=search(in,pre[plo]);
      int c=idx-ilo;
      nn.left=fn(pre,in,plo+1,plo+c,ilo,idx-1);
      nn.right=fn(pre,in,plo+c+1,phi,idx+1,ihi);
      return nn;
    }
public int search(int[]in,int item){
    for(int i=0;i<in.length;i++){
        if(in[i]==item)
        return i;
    }

    return -1;
}
}
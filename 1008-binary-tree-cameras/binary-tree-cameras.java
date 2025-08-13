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
    int camera=0;
    public int minCameraCover(TreeNode root) {
      int c=  minCamera(root);
      if(c==-1)
      camera++;
      return camera;
    }
    public int minCamera(TreeNode root) {
        if(root==null)
        return 0;
       
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1 || right==-1){ //is node pr camera ki need h
            camera++;
            return 1; //camera setup kiya h is node pr
        }
      else   if(left==1 || right==1){ 
        //inme se kisi ek ke paas  ya donio ke paas camera h 
            return 0; //iska mtlb  node covered hu
        }
        else {
            
            return -1; //need a camera
        }

    }
}
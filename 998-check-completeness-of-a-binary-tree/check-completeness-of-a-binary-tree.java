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
    public boolean isCompleteTree(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean nullFound = false;
        while(!q.isEmpty()){
           
            int size=q.size();
           List<Integer>ll= new ArrayList<>();
    for(int i=0;i<size;i++){
         TreeNode rp=q.poll();
         if (rp == null) { nullFound = true; continue; } 
         if (nullFound) return false;
         ll.add(rp.val);
         q.add(rp.left); 
         q.add(rp.right);
          }
        ans.add(ll);
        }
//        int i=0;
//        int lastrow=ans.size()-1;
//        System.out.println(ans);
//        for(List<Integer> f:ans){
//         int m=(int)Math.pow(2,i);
//         if(i==lastrow){
//  if(f.size()!=m-1)
//  return false;
//  return true;
//         }
//        else if(f.size()!=m){
//         return false;
//        }
//         i++;
//        }
int lastrow = ans.size() - 2; 
for (int i = 0; i < lastrow; i++) 
{ int m = (int) Math.pow(2, i);

 if (ans.get(i).size() != m) 
 return false; 
 } 
        return true;
    }
}
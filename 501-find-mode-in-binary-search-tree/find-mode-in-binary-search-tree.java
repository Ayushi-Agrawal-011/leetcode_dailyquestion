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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        t(root,map);
int maxi=0;
for(int v:map.values()){
    maxi=Math.max(maxi,v);
}
 
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == maxi) {
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
       
    }
    public void t(TreeNode root, HashMap<Integer,Integer> map){
        if(root==null)
        return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        t(root.right,map);
        t(root.left,map);
return ;
    }
}
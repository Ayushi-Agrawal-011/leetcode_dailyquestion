
class Solution {
    List<TreeNode> ll = new ArrayList<>();
HashMap<String, Integer> map = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        fn(root);
        return ll;
    }
public String fn(TreeNode root){
if(root==null)
return "#";
 String s = root.val + "," + fn(root.left) + "," + fn(root.right);
 map.put(s,map.getOrDefault(s,0)+1);
 if(map.get(s)==2){
    ll.add(root);
    
 }
 return s;
}
   
}
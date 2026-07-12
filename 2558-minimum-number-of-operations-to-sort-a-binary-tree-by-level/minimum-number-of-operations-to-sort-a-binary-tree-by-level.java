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
    public int minimumOperations(TreeNode root) {
        List<List<Integer>> ll=levelOrder(root);
        int ans=0;
        for(int i=0;i<ll.size();i++){
            List<Integer> curr = new ArrayList<>(ll.get(i));
    List<Integer> l2 = new ArrayList<>(ll.get(i));
    Collections.sort(l2);

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int j = 0; j < curr.size(); j++) {
        map.put(curr.get(j), j);
    }

    int c = 0;

    for (int j = 0; j < l2.size(); j++) {

        if (curr.get(j).equals(l2.get(j))) {
            continue;
        }

        int idx = map.get(l2.get(j));

        int temp = curr.get(j);

        Collections.swap(curr, j, idx);

        // map update
        map.put(temp, idx);
        map.put(l2.get(j), j);

        c++;}ans+=c;
        }
        return ans;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null )
        return new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int s=q.size();
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<s;i++){
            TreeNode r=q.poll();
            ll.add(r.val);
            if(r.left!=null)
            q.add(r.left);
            if(r.right!=null)
            q.add(r.right);
        }
        res.add(ll);
    } 
    return res;   
    }
}
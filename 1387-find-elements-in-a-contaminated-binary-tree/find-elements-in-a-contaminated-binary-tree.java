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
class FindElements {
 List<Integer> ll=new ArrayList<>();
    public  FindElements(TreeNode root) {
        root.val=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
         
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode rp=q.poll();
                ll.add(rp.val);
                if(rp.left!=null){
                    rp.left.val=2*rp.val+1;
                    q.add(rp.left);

                }
                if(rp.right!=null){
                    rp.right.val=2*rp.val+2;
                    q.add(rp.right);
                    
                }
            }
        }
      

    }
    
    public boolean find(int target) {
       return ll.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
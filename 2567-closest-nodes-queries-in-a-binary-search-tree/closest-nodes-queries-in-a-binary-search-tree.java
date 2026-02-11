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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
       List<Integer> ll=new ArrayList<>();
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        TreeNode r=q.poll();
        ll.add(r.val);
        if(r.left!=null)
        q.add(r.left);
        if(r.right!=null)
        q.add(r.right);
       }
       Collections.sort(ll);
       System.out.println(ll);
       List<List<Integer>> k=new ArrayList<>();
       for(int i=0;i<queries.size();i++){
        int a=queries.get(i);
        List<Integer> p=new ArrayList<>();
int min=sm(ll,a);
int max=lg(ll,a);

        p.add(min);
        p.add(max);
        k.add(p);
       }
       return k;
    }
public int sm(List<Integer> ll,int item){
    int low=0;
    int high=ll.size()-1;
    int ans=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(ll.get(mid)<=item){
            ans=ll.get(mid);
           low=mid+1;
        }
        else
        high=mid-1;
    }
    return ans;
}
public int lg(List<Integer> ll,int item){
    int low=0;
    int high=ll.size()-1;
    int ans=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(ll.get(mid)>=item){
            ans=ll.get(mid);
         high=mid-1;
        }
        else
          low=mid+1;
        
    }
    return ans;
}

}
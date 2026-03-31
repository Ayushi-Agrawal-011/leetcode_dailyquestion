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
    public int amountOfTime(TreeNode root, int start) {
       HashMap<Integer,List<Integer>> map=new HashMap<>();
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode r=q.poll();
            if(!map.containsKey(r.val))
            map.put(r.val,new ArrayList<>());
            if(r.left!=null){
                   if(!map.containsKey(r.left.val))
            map.put(r.left.val,new ArrayList<>());
                map.get(r.val).add(r.left.val);
                 map.get(r.left.val).add(r.val);
                 q.add(r.left);
            }
            if(r.right!=null){
                   if(!map.containsKey(r.right.val))
            map.put(r.right.val,new ArrayList<>());
                map.get(r.val).add(r.right.val);
                 map.get(r.right.val).add(r.val);
                 q.add(r.right);
            }
        }}
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.time-b.time));

        HashSet<Integer> visited=new HashSet<>();

       int ans=0; 
       pq.add(new Pair(start,0));
       while(!pq.isEmpty()){
        Pair rp=pq.poll();
        if(visited.contains(rp.vtx))
        continue;
        visited.add(rp.vtx);
        ans=Math.max(ans,rp.time);
        for(int nbrs:map.get(rp.vtx)){
            if(!visited.contains(nbrs))
            pq.add(new Pair(nbrs,rp.time+1));
        }
       }
       return ans;
       }
       class Pair{
        int vtx;
        int time;
        public Pair(int vtx,int time){
            this.vtx=vtx;
            this.time=time;
        }
       } 
    
}
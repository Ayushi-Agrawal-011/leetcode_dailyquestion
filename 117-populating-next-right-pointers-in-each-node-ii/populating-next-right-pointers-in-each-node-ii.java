/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
      List<List<Node>> ans=levelOrder(root);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size()-1;j++){
                Node p=ans.get(i).get(j);
                p.next=ans.get(i).get(j+1);
            }
        }
        return root;
    }
    public List<List<Node>> levelOrder(Node root) {
        if(root==null )
        return new ArrayList<>();
    List<List<Node>> res=new ArrayList<>();
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int s=q.size();
        List<Node> ll=new ArrayList<>();
        for(int i=0;i<s;i++){
            Node r=q.poll();
            ll.add(r);
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
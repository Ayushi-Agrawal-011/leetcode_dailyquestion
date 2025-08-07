/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


class Solution {
    int maxd=0;
    public int maxDepth(Node root) {
         r(root,1);
    return maxd;
    }
    public void r(Node root,int cl){
            //System.out.println(maxd+" "+cl);
        if(root==null)
        return;
    
        if(maxd<cl){
         
         maxd=cl;
        }
     for(Node n:root.children){
        r(n,cl+1);
     }  
   
    }
}
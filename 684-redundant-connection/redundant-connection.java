class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;

        for(int i=1;i<=n;i++){
            create(i);
        }
        for(int[]e:edges){
            int e1=e[0];
            int e2=e[1];
            int re1=find(e1);
            int re2=find(e2);
            if(re1==re2)
            return e;
            else
            union(e1,e2);

        }
        return new int[0];
    }
    private HashMap<Integer,Node> map=new HashMap<>();
    public void create(int v){
        Node nn=new Node();
        nn.val=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);
    }
    class Node{
        int val;
        int rank;
        Node parent;
    }
    public int find(int v){
        Node nn=map.get(v);
        return find(nn).val;
    }
    public Node find(Node n){
        if(n.parent==n)
        return n;
        Node nn=find(n.parent);
        n.parent=nn;
        return nn;
    }
    public void union(int v1,int v2){
        
        Node node1=map.get(v1);
        Node node2=map.get(v2);
        Node re1=find(node1);
         Node re2=find(node2);
         if(re1.rank==re2.rank){
            re1.parent=re2;
            re2.rank++;
         }
        else if(re1.rank<re2.rank)
          re1.parent=re2;
       else
        re2.parent=re1;
    }

}
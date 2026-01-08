class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        for(int i=1;i<=edges.length;i++){
            create(i);
        }
        for(int[]e:edges){
            int re1=find(e[0]);
            int re2=find(e[1]);
            if(re1==re2)
            return e;
            else
            union(e[0],e[1]);
        }
        return new int[0];
    }
    class Node{
	int val;
	int rank;
	Node parent;
	
}
private  HashMap<Integer,Node> map=new HashMap<>();
public void create(int v) {
	Node nn=new Node();
	nn.val=v;
	nn.rank=0;
	nn.parent=nn;
	map.put(v, nn);
	
	
}
public int find(int v) {


Node node=map.get(v);
return find(node).val;//finding reprensentative element
	
}
private Node find(Node node) {

if(node.parent==node)
	return node;
Node n=find(node.parent);
node.parent=n;//path compression
return n;
	
}
public void union(int v1,int v2) {
	Node node1=map.get(v1);//v1 vtx khn pr create hua h
	Node node2=map.get(v2);//v2 vtx khn pr create hua h
	Node re1=find(node1);// v1 ka reprensentative element  kha bna h
	Node re2=find(node2);// v2 ka reprensentative element  kha bna h
	if(re1.rank==re2.rank) {
		re1.parent=re2;
		re2.rank++;
	}
	else if(re1.rank<re2.rank) {
re1.parent=re2;


	}
	else {
		re2.parent=re1;
		
	}

	
}
}
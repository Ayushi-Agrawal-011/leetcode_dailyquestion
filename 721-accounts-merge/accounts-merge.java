class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        for(int i=0;i<n;i++){
            create(i);
        }
        HashMap<String,Integer> emap=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                if(!emap.containsKey(accounts.get(i).get(j)))
                emap.put(accounts.get(i).get(j),i);
                else
                union(i,emap.get(accounts.get(i).get(j)));
            }
        }
        HashMap<Integer, TreeSet<String>> merged = new HashMap<>();
        for(String k:emap.keySet()){
              int acc = emap.get(k);
               int p = find(acc);

            merged.putIfAbsent(p, new TreeSet<>());
            merged.get(p).add(k);
        }
         List<List<String>> res = new ArrayList<>();
            for (int p : merged.keySet()) {
            List<String> ll = new ArrayList<>();
            ll.add(accounts.get(p).get(0)); // name
            ll.addAll(merged.get(p));
            res.add(ll);
        }

        return res;
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
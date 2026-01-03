class Solution {
    public boolean isPossible(int n, List<List<Integer>> edges) {
    HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
    for(int i=1;i<=n;i++){
        map.put(i,new HashSet<>());
    }  
    int[]degree=new int[n];
    for(int i=0;i<edges.size();i++){
        int a=edges.get(i).get(0);
        int b=edges.get(i).get(1);
        degree[a-1]++;
        degree[b-1]++;
        map.get(a).add(b);
         map.get(b).add(a);
    }

    ArrayList<Integer> res=new ArrayList<>();
for(int i=0;i<n;i++){
    if(degree[i]%2==1){
    
res.add(i+1);
    }
}
if(res.size()==0)
return true;
if(res.size()==2){
int a=res.get(0);
int b=res.get(1);
if(!map.get(a).contains(b) &&!map.get(b).contains(a))
return true;
for(int i=1;i<=n;i++){
    if(a!=i && b!=i && !map.get(a).contains(i) && !map.get(b).contains(i))
    return true;
}
return false;

}
if(res.size()==4){
    int a=res.get(0);
int b=res.get(1);
int c=res.get(2);
int d=res.get(3);
 if (!map.get(a).contains(b) && !map.get(c).contains(d)) {
                return true;
            }
            if (!map.get(a).contains(c) && !map.get(b).contains(d)) {
                return true;
            }
            if (!map.get(a).contains(d) && !map.get(b).contains(c)) {
                return true;
            }
            return false;
}
return false;
    }
}
class Solution {
    public int[] restoreArray(int[][] edges) {
        int n=edges.length+1;
        int[] ans=new int[n];
   HashMap<Integer,List<Integer>> map=new HashMap<>();

        for(int []e:edges){
              int u = e[0];
            int v = e[1];
            map.putIfAbsent(u, new ArrayList<>());
              map.putIfAbsent(v, new ArrayList<>());

           map.get(u).add(v);
             map.get(v).add(u);
        }
        int start=0;

        for(int k:map.keySet()){
            if(map.get(k).size()==1){
                start=k;
                break;
            }
        }
        Stack<Integer> st=new Stack<>();
        st.add(start);
        int i=0;
     
        HashSet<Integer> visited=new HashSet<>();
        
        while(!st.isEmpty()){
int r=st.pop();
if(visited.contains(r))
continue;
visited.add(r);
if(i==n)
return ans;
ans[i]=r;
i++;
for(int nbrs:map.get(r)){
    if(!visited.contains(nbrs))
    st.push(nbrs);
}


        }
return ans;

    }
}
class Solution {
    private HashMap<String,List<String>> map;
    public List<String> findItinerary(List<List<String>> tickets) {
        map=new HashMap<>();
        for(List<String> k:tickets){
            String src=k.get(0);
            String des=k.get(1);
            if(!map.containsKey(src)){
                map.put(src,new ArrayList<>());
            }
            map.get(src).add(des);
        }
        for(String k:map.keySet()){
            Collections.sort(map.get(k));
        }
        List<String> ans=new ArrayList<>();
        Stack<String> st=new Stack<>();
  
        st.push("JFK");
        while(!st.isEmpty()){
  String r=st.peek();

  if(map.containsKey(r) && map.get(r).size()>0){
  st.push(map.get(r).get(0));
  map.get(r).remove(0);
  }
  else {
                ans.add(st.pop());
            }
        }
        Collections.reverse(ans);
return ans;
    }
}
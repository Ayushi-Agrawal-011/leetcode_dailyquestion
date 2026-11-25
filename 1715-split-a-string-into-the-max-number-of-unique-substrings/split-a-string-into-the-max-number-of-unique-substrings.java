class Solution {
    int ans=0;
    public int maxUniqueSplit(String s) {
      fn(s,new ArrayList<>()); 
      return ans;
    }
    public void fn(String s,List<String> ll){
        if(s.length()==0){
            ans=Math.max(ans,ll.size());
            return ;
        }
        for(int cut=1;cut<=s.length();cut++){
            String p=s.substring(0,cut);
            if(!ll.contains(p)){
                ll.add(p);
                fn(s.substring(cut),ll);
                ll.remove(ll.size()-1);
            }
        }

    }


}
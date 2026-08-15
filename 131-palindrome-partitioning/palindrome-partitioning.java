class Solution {
    public List<List<String>> partition(String s) {
      List<List<String>> ans=new ArrayList<>();
 fn(s,new ArrayList<>(),ans);  
 return ans;
    }
    public void fn (String s,List<String> ll,List<List<String>> p){
        if(s.length()==0){
  
            p.add(new ArrayList<String>(ll));
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String t=s.substring(0,cut);
            if(ispal(t)){
                ll.add(t);
                fn(s.substring(cut),ll,p);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean ispal(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
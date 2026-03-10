class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     
       HashMap<Character,Integer> map=new HashMap<>();
List<Integer> ans=new ArrayList<>();
       HashMap<Character,Integer> mp=new HashMap<>();
            if(s.length() < p.length()) return ans;
       for(int i=0;i<p.length();i++){
        char ch=p.charAt(i);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
         char a=s.charAt(i);
        map.put(a,map.getOrDefault(a,0)+1);
       }
       

       if(map.equals(mp))
       ans.add(0);
       int ei=p.length();
       int si=0;
       while(ei<s.length()){
        char ch=s.charAt(ei);
        map.put(ch,map.getOrDefault(ch,0)+1);
        char a=s.charAt(si);
        map.put(a,map.getOrDefault(a,0)-1);
        if(map.get(a)==0){
        map.remove(a);
        }
        si++;
        
        if(map.equals(mp)){
            ans.add(si);

        }
ei++;

       }
return ans;
    }
}
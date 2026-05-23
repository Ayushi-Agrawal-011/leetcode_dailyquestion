class Solution {
    public List<Integer> findAnagrams(String s, String p) {
          HashMap<Character,Integer> map=new HashMap<>();
           HashMap<Character,Integer> mp=new HashMap<>();
if(s.length()<p.length())
return new ArrayList<>();
           for(int i=0;i<p.length();i++){
            mp.put(p.charAt(i),mp.getOrDefault(p.charAt(i),0)+1);
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
           }
           List<Integer> res=new ArrayList<>();
       int ei=p.length(),si=0,ans=0;
       if(map.equals(mp))
res.add(0);
       ans++;
       while(ei<s.length()){
        char ch=s.charAt(ei);
        map.put(ch,map.getOrDefault(ch,0)+1);
       
            char ch1=s.charAt(si);
             map.put(ch1,map.getOrDefault(ch1,0)-1);
             if(map.get(ch1)==0){
                map.remove(ch1);
             }
             si++;
        
        if(map.equals(mp))
        res.add(si);
        ans++;
   
        ei++;
       } 
       return res;
    }
}
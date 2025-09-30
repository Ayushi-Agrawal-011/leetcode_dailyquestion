class Solution {
    public boolean checkInclusion(String p, String s) {
         List<Integer> ans=new ArrayList<>();
        if (s.length() < p.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
     HashMap<Character,Integer> mp=new HashMap<>();
     for(int i=0;i<p.length();i++){
        map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
     }
     if(map.equals(mp))
  return true;
        int si=0,ei=p.length();
       
        while(ei<s.length()){
            char ch=s.charAt(ei);
           
            mp.put(ch,mp.getOrDefault(ch,0)+1);
         
            
                char a=s.charAt(si++);
                mp.put(a,mp.getOrDefault(a,0)-1);
                if(mp.get(a)==0)
                 mp.remove(a);
                 
                 
                        if(map.equals(mp))
           return true;
            ei++;
        }
        return false;     
    }
}
class Solution {
    public boolean checkInclusion(String p, String s) {
        if(s.length()<p.length())
        return false;
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

       mp.put(s.charAt(ei),mp.getOrDefault(s.charAt(ei),0)+1);
       char ch=s.charAt(si++);
      mp.put(ch,mp.getOrDefault(ch,0)-1);
      if(mp.get(ch)==0)
      mp.remove(ch);
      if(map.equals(mp))
      return true;
      ei++;
   }
   return false;
    }
}
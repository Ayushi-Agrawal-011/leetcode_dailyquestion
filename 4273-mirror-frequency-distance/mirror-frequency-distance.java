class Solution {
    public int mirrorFrequency(String s) {
        Set<Character> visited=new HashSet<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int ans=0;
         for(int i=0;i<s.length();i++){
            if(!visited.contains(s.charAt(i))){
          if(s.charAt(i)>=97 && s.charAt(i)<=122){
            char ch=s.charAt(i);
            char mirror=(char) ('z' - (ch - 'a'));
            visited.add(mirror);
            visited.add(s.charAt(i));
     int freq1 = map.getOrDefault(ch, 0);
                int freq2 = map.getOrDefault(mirror, 0);

                ans += Math.abs(freq1 - freq2);

          }
          else{
            char ch=s.charAt(i);
             char mirror=(char) ('9' - (ch - '0'));
            visited.add(mirror);
            visited.add(s.charAt(i));
     int freq1 = map.getOrDefault(ch, 0);
                int freq2 = map.getOrDefault(mirror, 0);

                ans += Math.abs(freq1 - freq2);
          }
            }
         }
         return ans;
    }
}
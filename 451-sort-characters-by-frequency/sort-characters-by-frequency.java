class Solution {
    public String frequencySort(String s) {
            TreeMap<Character,Integer> map=new TreeMap<>();
            TreeMap<Integer,List<Character>> mp=new TreeMap<>(Collections.reverseOrder());
            for(char ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(char ch:map.keySet()){
                mp.putIfAbsent(map.get(ch),new ArrayList<>());
                mp.get(map.get(ch)).add(ch);
            }
            StringBuilder sb=new StringBuilder();
              for(int x:mp.keySet()){
             for(char p:mp.get(x)){
                for(int i=0;i<x;i++){
                    sb.append(p);
                }
             }
            }
            return sb.toString();

    }
}
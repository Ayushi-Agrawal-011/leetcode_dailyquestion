class Solution {
    public boolean isItPossible(String word1, String word2) {
        HashMap<Character,Integer> map=new HashMap<>();
            HashMap<Character,Integer> mp=new HashMap<>();
            for(char ch:word1.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
             for(char ch:word2.toCharArray()){
                mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
         for(char i='a';i<='z';i++){
             for(char j='a';j<='z';j++){
                if(map.containsKey(i) && mp.containsKey(j)){
                      mp.put(j,mp.getOrDefault(j,0)-1);
                      if(mp.get(j)==0)
                      mp.remove(j);
                     map.put(j,map.getOrDefault(j,0)+1);
                      map.put(i,map.getOrDefault(i,0)-1);
                      if(map.get(i)==0)
                      map.remove(i);
                     mp.put(i,mp.getOrDefault(i,0)+1);
                     if(map.size()==mp.size())
                     return true;
                       map.put(j,map.getOrDefault(j,0)-1);
                      if(map.get(j)==0)
                      map.remove(j);
                     mp.put(j,mp.getOrDefault(j,0)+1);
                      mp.put(i,mp.getOrDefault(i,0)-1);
                      if(mp.get(i)==0)
                      mp.remove(i);
                     map.put(i,map.getOrDefault(i,0)+1);
                }
             }
         }
         return false;
    }
}
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int freq=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            freq=map.get(ch);
        }
        for(char ch:map.keySet()){
if(map.get(ch)!=freq)
return false;
        }
        return true;
    }
}
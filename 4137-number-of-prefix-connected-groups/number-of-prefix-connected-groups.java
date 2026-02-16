class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words){
            if(s.length()<k)
            continue;
            String t=s.substring(0,k);
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int c=0;
        for(String v:map.keySet()){
            if(map.get(v)>=2)
            c++;
        }
        return c;
    }
}
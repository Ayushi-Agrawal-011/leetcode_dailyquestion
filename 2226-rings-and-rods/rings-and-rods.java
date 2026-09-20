class Solution {
    public int countPoints(String s) {
        HashMap<Integer,Set<Character>> map=new  HashMap<>();
        int n=s.length()/2;
        for(int i=0;i<=9;i++){
            map.put(i,new HashSet<>());
        }
        for(int i=0;i<2*n;i+=2){
            int k=(s.charAt(i+1)-'0');
            char ch=s.charAt(i);
            map.get(k).add(ch);
        }
        int c=0;
        for(int k:map.keySet()){
            if(map.get(k).size()==3)
            c++;
        }
        return c;
    }
}
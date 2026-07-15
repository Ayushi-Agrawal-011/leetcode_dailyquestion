class Solution {
    public long calculateScore(String s) {
        int n=s.length();
      int[]mirror=new int[26];
      for(int i=0;i<26;i++){
        mirror[i]=25-i;
      }
      Map<Integer,Stack<Integer>> map=new HashMap<>();
      for(int i=0;i<26;i++){
        map.put(i,new Stack<>());
      }
     long score=0;
      for(int i=0;i<n;i++){
        int idx=s.charAt(i)-'a';
        if(!map.get(mirror[idx]).isEmpty()){
            int j=map.get(mirror[idx]).pop();
            score+=i-j;
        }
        else{
 map.get(idx).push(i);
            
        }
      }
      return score;
    }
}
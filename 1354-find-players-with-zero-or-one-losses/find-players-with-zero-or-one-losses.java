class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
       HashMap<Integer,Integer> win=new HashMap<>();
       HashMap<Integer,Integer> lose=new HashMap<>(); 
       for(int[]m:matches){
        win.put(m[0], win.getOrDefault(m[0], 0) + 1);
            lose.put(m[1], lose.getOrDefault(m[1], 0) + 1);
       }
       List<Integer> a0=new ArrayList<>();
       List<Integer> a1=new ArrayList<>();
       List<List<Integer>> ans=new ArrayList<>();
       for(int k:win.keySet()){
        if(!lose.containsKey(k)){
            a0.add(k);
        }
       }
        for(int k:lose.keySet()){
        if(lose.get(k)==1){
            a1.add(k);
        }
       }
       Collections.sort(a0);
        Collections.sort(a1);
ans.add(a0);
ans.add(a1);
return ans;
    }
}
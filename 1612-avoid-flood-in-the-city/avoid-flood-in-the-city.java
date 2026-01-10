class Solution {
    public int[] avoidFlood(int[] rains) {
      int[]ans=new int[rains.length];
      Arrays.fill(ans,-1); 
      HashMap<Integer,Integer> full=new HashMap<>();
      TreeSet<Integer> dry=new TreeSet<>();
      for(int i=0;i<rains.length;i++){
        if(rains[i]==0){
        dry.add(i);
         ans[i] = 1; 
        }
        else{
            int lake=rains[i];
            if(full.containsKey(lake)){
              if(dry.isEmpty())
                return new int[0];
                Integer d = dry.higher(full.get(lake));
                if (d == null) return new int[0];
                ans[d]=lake;
                dry.remove(d);
            }
            full.put(lake,i);
            ans[i]=-1;
        }
      }
     return ans;
    }
}
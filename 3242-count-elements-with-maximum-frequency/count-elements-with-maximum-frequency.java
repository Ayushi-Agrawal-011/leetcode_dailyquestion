class Solution {
    public int maxFrequencyElements(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int maxfreq=0;
      for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
        maxfreq=Math.max(maxfreq,map.get(x));
      }
      int ans=0;
      for(int k:map.keySet()){
        if(map.get(k)==maxfreq){
            ans+=maxfreq;
        }
      }
      return ans;
    }
}
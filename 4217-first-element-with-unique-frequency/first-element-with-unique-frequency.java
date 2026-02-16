class Solution {
    public int firstUniqueFreq(int[] nums) {
      LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        // Count frequency
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

       HashMap<Integer,Integer> freqCount = new HashMap<>();
        for(int val : map.values()){
            freqCount.put(val, freqCount.getOrDefault(val, 0) + 1);
        }

        
        for(int key : map.keySet()){
            if(freqCount.get(map.get(key)) == 1){
                return key;
            }
        }

        return -1;
    }
}
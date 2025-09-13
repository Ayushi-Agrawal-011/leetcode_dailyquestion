class Solution {
    public int edgeScore(int[] nums) {
    
         TreeMap<Integer, Long> mp = new TreeMap<>(Collections.reverseOrder());
        
    
        for(int i=0;i<nums.length;i++){
               int num = nums[i];
            mp.put(num, mp.getOrDefault(num, 0L) + i);
        }
 long maxScore = -1;
        int ans = -1;
        for (int num : mp.keySet()) {
            long s = mp.get(num);
            if (s > maxScore) {
                maxScore = s;
                ans = num;
            } 
            else if (s == maxScore && num < ans) { 
                ans = num;
            }
        }

        return ans;
    }
}
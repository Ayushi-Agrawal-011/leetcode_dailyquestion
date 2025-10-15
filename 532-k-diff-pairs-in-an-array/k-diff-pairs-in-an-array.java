class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
          if (k < 0) return 0; // difference can’t be negative

        if (k == 0) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : nums)
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            int count = 0;
            for (int val : freq.values())
                if (val > 1) count++;
            return count;
        }
   HashSet<Integer> set=new HashSet<>();
   for(int i=0;i<nums.length;i++){
    set.add(nums[i]);
   }
   int c=0;
   for(int x:set){
    int p=x+k;
    if(set.contains(p)){
    c++;
    }
   
   }
     return c;   
    }
}
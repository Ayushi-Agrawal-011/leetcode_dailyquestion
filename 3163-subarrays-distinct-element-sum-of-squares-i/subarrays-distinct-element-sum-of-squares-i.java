class Solution {
    public int sumCounts(List<Integer> nums) {
      int ans=0;
      for(int len=1;len<=nums.size();len++){
        ans+=fn(nums,len);
      }  
      return ans;
    }
    public int fn(List<Integer> nums,int k){
         HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < k; i++) {
            map.put(nums.get(i),
                map.getOrDefault(nums.get(i), 0) + 1);
        }

        ans += map.size()*map.size();

        for (int i = k; i < nums.size(); i++) {
            int remove = nums.get(i - k);

            map.put(remove, map.get(remove) - 1);

            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            int add = nums.get(i);
            map.put(add, map.getOrDefault(add, 0) + 1);

            ans += map.size()*map.size();
        }

        return ans;
    }
}
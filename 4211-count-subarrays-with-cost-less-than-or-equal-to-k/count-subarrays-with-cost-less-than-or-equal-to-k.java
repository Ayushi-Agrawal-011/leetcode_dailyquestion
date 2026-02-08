class Solution {
    public long countSubarrays(int[] nums, long k) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int ei=0,si=0;
        long ans=0;
        int n=nums.length;
        while(ei<n){
            map.put(nums[ei],map.getOrDefault(nums[ei],0)+1);
          while (!map.isEmpty() &&
                   (long)(map.lastKey() - map.firstKey()) * (ei - si + 1) > k) {
                map.put(nums[si],map.get(nums[si])-1);
                if(map.get(nums[si])==0)
                map.remove(nums[si]);
                si++;
            }
            ans+=(ei-si+1);
            ei++;
        }
        return ans;
    }
}
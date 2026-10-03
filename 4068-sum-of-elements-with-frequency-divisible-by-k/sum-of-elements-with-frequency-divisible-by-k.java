class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
     int ans=0;
     HashMap<Integer, Integer> map = new HashMap<>();

for(int x : nums) {
    map.put(x, map.getOrDefault(x, 0) + 1);
}   
for(int l:map.keySet()){
    if(map.get(l)%k==0)
    ans+=map.get(l)*l;
}
return ans;
    }
}
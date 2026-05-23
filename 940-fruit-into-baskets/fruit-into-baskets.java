class Solution {
    public int totalFruit(int[] nums) {
     int ei=0,si=0,ans=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     while(ei<nums.length){
        map.put(nums[ei],map.getOrDefault(nums[ei],0)+1);
        while(map.size()>2){
map.put(nums[si],map.getOrDefault(nums[si],0)-1);
if(map.get(nums[si])==0)
map.remove(nums[si]);
si++;
        }
        ans=Math.max(ans,ei-si+1);
        ei++;

     }
     return ans;
    }
}
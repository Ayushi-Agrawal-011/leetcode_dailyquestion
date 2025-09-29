class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer >map=new HashMap<>();
        int l=0,ans=0;
        for(int i=0;i<nums.length;i++){
map.put(nums[i],map.getOrDefault(nums[i],0)+1);
while(map.size()>2){
    map.put(nums[l],map.get(nums[l])-1);
    if(map.get(nums[l])==0)
    map.remove(nums[l]);
    l++;
}
ans=Math.max(ans,i-l+1);
        }
        return ans;

    }
}
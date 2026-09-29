class Solution {
    public int countSpecialIntegers(int[] nums) {
      HashMap<Integer,List<Integer>> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i]))
        map.put(nums[i],new ArrayList<>());
        map.get(nums[i]).add(i);
      }  
      int ans=0;
for(int k:map.keySet()){
    if(map.get(k).size()<3)
    continue;

    int d=map.get(k).get(1)-map.get(k).get(0);
    int c=2;
    for(int i=2;i<map.get(k).size();i++){
        int diff=map.get(k).get(i)-map.get(k).get(i-1);
        if(diff==d)
        c++;
        else{
            break;
        }

    }
    if(c==map.get(k).size())
    ans++;
}
return ans;
    }
}
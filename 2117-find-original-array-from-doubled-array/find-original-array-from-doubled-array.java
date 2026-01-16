class Solution {
    public int[] findOriginalArray(int[] nums) {
     Arrays.sort(nums);
     int n=nums.length;
       if (nums.length%2==1) return new int[]{};
       Map<Integer, Integer> map = new TreeMap<>();
     List<Integer>ll=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        else{
            if(map.containsKey(nums[i]/2) && map.get(nums[i] / 2) > 0){
                ll.add(nums[i]/2);
                map.put(nums[i]/2,map.getOrDefault(nums[i]/2,0)-1);
            }
            else
              map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
    }
    if(ll.size()<nums.length/2)
    return new int[]{};
    int[]ans=new int[ll.size()];
    for(int i=0;i<ans.length;i++){
        ans[i]=ll.get(i);
    }
     return ans;
    }
}
class Solution {
    public int largestInteger(int[] nums, int k) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        if(k==n){
     return Arrays.stream(nums).max().getAsInt();
        }
        if(k==1){
            int a=Arrays.stream(nums).max().getAsInt();
            if(map.get(a)==1){
                return a;
            }
            else {
                while( !map.isEmpty() &&map.get(map.lastKey())>1){
                    map.remove(map.lastKey());
                }
                if(!map.isEmpty())
                return map.lastKey();
                return -1;
            }

        }
        else{
           int ans = -1;

    if(map.get(nums[0]) == 1)
        ans = Math.max(ans, nums[0]);

    if(map.get(nums[n-1]) == 1)
        ans = Math.max(ans, nums[n-1]);

    return ans;
        }
    }
}
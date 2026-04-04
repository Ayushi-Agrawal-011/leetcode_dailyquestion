class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
       int[]ans=new int[nums.length];
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
    }
    for(int i=0;i<operations.length;i++){
        int a=operations[i][0];
        int b=operations[i][1];
        int v=map.get(a);
        map.remove(a);
        map.put(b,v);
    } 
    for(int k:map.keySet()){
        ans[map.get(k)]=k;
    }
    return ans;
    }
}
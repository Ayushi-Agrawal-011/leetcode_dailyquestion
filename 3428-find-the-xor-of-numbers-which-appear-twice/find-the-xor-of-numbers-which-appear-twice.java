class Solution {
    public int duplicateNumbersXOR(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       } 
       int xor=0;
       for(int k:map.keySet()){
        if(map.get(k)==2)
        xor^=k;
       }
       return xor;
    }
}
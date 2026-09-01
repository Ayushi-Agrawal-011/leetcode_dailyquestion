class Solution {
    public int findClosestNumber(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int x:nums){
            int t=Math.abs(x-0);
            map.put(x,t);
        }
        int mindist=Integer.MAX_VALUE;
        int ans=0;
        for(int k:map.keySet()){
            if(map.get(k)<mindist){
                
                    
                mindist=map.get(k);
                ans=k;
            }
        }
        return ans;
    }
}
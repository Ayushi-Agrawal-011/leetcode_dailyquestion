class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int p=nums[i]*nums[j];
                map.put(p,map.getOrDefault(p,0)+1);
            }
        }
        for(int k:map.keySet()){
            int v=map.get(k);
            ans+=(8*(v*(v-1))/2);
        }
        return ans;
    }
}
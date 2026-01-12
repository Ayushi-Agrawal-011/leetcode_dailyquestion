class Solution {
    public int longestBalanced(int[] nums) {
        int [] k=nums;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> e=new HashSet<>();
             Set<Integer> o=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0)
                    e.add(nums[j]);
                else
                    o.add(nums[j]);
                if(e.size()==o.size())
                    maxi=Math.max(maxi,j-i+1);
            }
        }
        return maxi;
    }
}
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int rem=0;
        for(int x:nums){
        rem=(rem*2+x)%5;
        ans.add(rem==0);
        }
        return ans;
    }
}
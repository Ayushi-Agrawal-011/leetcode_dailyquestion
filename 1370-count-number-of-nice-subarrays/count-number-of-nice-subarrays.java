class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return fn(nums,k)-fn(nums,k-1);
    }
    public int fn(int []nums,int k){
        HashSet<String> set=new HashSet<>();
        int ans=0;
        int ei=0;
        int si=0;
        int ans2=0;
while(ei<nums.length){
   if(nums[ei]%2!=0)
   ans++;
while(ans>k){
   if(nums[si]%2!=0)
   ans--;
    si++;
}


ans2+=(ei-si+1);
ei++;
}
return ans2;
    }
}
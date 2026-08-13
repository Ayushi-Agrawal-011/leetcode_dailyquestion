class Solution {
    public int longestConsecutive(int[] nums) {
 HashSet<Integer> set=new HashSet<>();
 for(int x:nums){
    set.add(x);
 }
 int ans=0;
 for(int i=0;i<nums.length;i++){
    if(!set.contains(nums[i]-1)){
 int key=nums[i];
 int c=0;
 while(set.contains(key)){
    c++;
   set.remove(key);
   key=key+1;
 }
 ans=Math.max(ans,c);}
 }
 return ans;
    }
}
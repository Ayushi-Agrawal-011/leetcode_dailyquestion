class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        
   
       HashSet<String> set=new HashSet<>();
        int ans=0;
        int ei=0;
        int si=0;
while(ei<nums.length){
   if(nums[ei]%p==0)
   ans++;
while(ans>k){
   if(nums[si]%p==0)
   ans--;
    si++;
}

StringBuilder sb=new StringBuilder();
for(int x=ei;x>=si;x--){
   sb.insert(0, nums[x] + ",");
                set.add(sb.toString());
}

ei++;
}
return set.size();
    }
}
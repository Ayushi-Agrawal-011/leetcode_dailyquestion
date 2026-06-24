class Solution {
    public int longestConsecutive(int[] nums) {
     Set<Integer> st=new HashSet<>();
     int ans=0;
     for(int i=0;i<nums.length;i++){
        st.add(nums[i]);
     }  
       for(int i=0;i<nums.length;i++){
       if(!st.contains(nums[i]-1)){
        int c=0;
          int key=nums[i];
        while(st.contains(key)){
            st.remove(key);
            c++;
            key=key+1;
        }
        ans=Math.max(ans,c);
       }
     }
  return ans; 
    }
}
class Solution {
    public int totalSteps(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int[]dp=new int[n];
        int ans=0;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            if(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                    dp[i]=Math.max(dp[i]+1,dp[st.peek()]);
                    st.pop();
                }
                 ans=Math.max(ans,dp[i]);
            st.push(i);
            }
           
        }
        return ans;
    }
}
class Solution {
    public int totalSteps(int[] nums) {
    int ans=0;
    int[]dp=new int[nums.length];
    Stack<Integer> st=new Stack<>();
    st.push(nums.length-1);
    for(int i=nums.length-2;i>=0;i--){
        if(st.isEmpty() ||nums[st.peek()]>=nums[i]){
            st.push(i);
        }
        else{
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                dp[i]=Math.max(dp[i]+1,dp[st.peek()]);
                st.pop();
            }
//System.out.println(dp[i]);
            ans=Math.max(ans,dp[i]);
            st.push(i);
        }
       // System.out.println(st);
    }
    return ans;
    }
}
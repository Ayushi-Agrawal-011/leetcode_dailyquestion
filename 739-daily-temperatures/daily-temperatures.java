class Solution {
    
    public int[] dailyTemperatures(int[] temperatures) {
     int []k=   NGE(temperatures);
       return k; 
    }
    public static int[] NGE(int []nums) {
		int[]ans=new int[nums.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<nums.length;i++){
		    while(!st.isEmpty()&& nums[i]>nums[st.peek()]){
		        int q=st.pop();
                ans[q]=i-q;
		    }
		    st.push(i);
		}
		while(!st.isEmpty()){
		    ans[st.pop()]=0;
		}

		return ans;

}

	}
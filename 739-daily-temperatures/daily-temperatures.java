class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int[]ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
          while(!st.isEmpty() &&  arr[i]>arr[st.peek()]){
            int j=st.pop();
            ans[j]=i-j;
          }
          st.push(i);
        }
        return ans;
    }
}
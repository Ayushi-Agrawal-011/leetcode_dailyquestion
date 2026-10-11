class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];

            }
            st.push(i);
        }
for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }

        return ans;


    }
}
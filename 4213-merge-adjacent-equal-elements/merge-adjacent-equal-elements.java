class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
      Stack<Long> st=new Stack<>();
      for(int x:nums){
        long y=x;
        while(!st.isEmpty()&& st.peek()==y){
            y+=st.pop();
        }
        st.push(y);
      }  
      return new ArrayList<>(st);
    }
}
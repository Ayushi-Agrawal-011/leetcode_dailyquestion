class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        Stack<Pair> st = new Stack<>();
        Stack<Pair> st2 = new Stack<>();

        for (int i = 0; i < nums.length; i++) {

            while (!st2.isEmpty() && nums[i] > nums[st2.peek().i]) {
                Pair rp = st2.pop();
                ans[rp.i] = nums[i];
            }

            Stack<Pair> temp = new Stack<>();

            while (!st.isEmpty() && nums[i] > nums[st.peek().i]) {
                Pair rp = st.pop();
                rp.c = 1;
                rp.max = nums[i];
                temp.push(rp);
            }

            while (!temp.isEmpty()) {
                st2.push(temp.pop());
            }

            st.push(new Pair(i));
        }

        return ans;
    }

    class Pair {
        int i;
        int c = 0;
        int max = -1;

        public Pair(int i) {
            this.i = i;
        }
    }
}
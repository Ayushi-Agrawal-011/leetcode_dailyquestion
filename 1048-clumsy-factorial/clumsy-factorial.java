
class Solution {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();

        st.push(n);
        n--;

        Queue<Character> q = new LinkedList<>();
        q.add('*');
        q.add('/');
        q.add('+');
        q.add('-');

        while (n > 0) {
         //   System.out.println(st);
            char ch = q.poll();

            if (ch == '*') {
                st.push(st.pop() * n);
            }
            else if (ch == '/') {
                st.push(st.pop() / n);
            }
            else if (ch == '+') {
                st.push(n);
            }
            else if (ch == '-') {
                st.push(-n);
            }

            q.add(ch);
            n--;
        }

        int ans = 0;

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}
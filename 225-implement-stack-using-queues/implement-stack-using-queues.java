class MyStack {
     Queue<Integer> st;

    public MyStack() {
          st = new LinkedList<>();
    }
    
    public void push(int x) {
        st.offer(x);
    }
    
    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        while(st.size()!=1){
            temp.offer(st.poll());
        }
        int value = st.poll();
        st = temp;
        return value;
    }
    
    public int top() {
            Queue<Integer> temp = new LinkedList<>();
        while(st.size()!=1){
            temp.offer(st.poll());
        }
        int value = st.poll();
        st = temp;
        st.offer(value);
        return value;
    }
    
    public boolean empty() {
            return st.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
class MinStack {
public List<Integer> min=new ArrayList<>();
public List<Integer> st=new ArrayList<>();
    public MinStack() {
      
    }
    
    public void push(int val) {
        st.add(val);
        if(min.isEmpty() || min.get(min.size()-1)>=val)
         min.add(val);
    }
    
    public void pop() {
        int a=st.remove(st.size()-1);
        if(!min.isEmpty() && min.get(min.size()-1)==a)
        min.remove(min.get(min.size()-1));
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public int getMin() {
        return min.get(min.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
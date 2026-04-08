class FrontMiddleBackQueue {

ArrayDeque<Integer> dq ;
    public FrontMiddleBackQueue() {
    dq = new ArrayDeque<>();
    }
    
    public void pushFront(int val) {
        dq.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        int size = dq.size();
       fn( val, dq.size() / 2);
    }
     public void fn( int val, int k) { 
        if(k==0){
        dq.addFirst(val);
        return;
        }
      int x=  dq.removeFirst();
      fn(val,k-1);
      dq.addFirst(x);
     }
    public void pushBack(int val) {
   dq.addLast(val);
    }
    
    public int popFront() {
     return !dq.isEmpty() ?          dq.removeFirst():-1;
    }
    
    public int popMiddle() {
               int size = dq.size();
    return !dq.isEmpty() ? fn2((size - 1) / 2) : -1;

    }
      public int fn2(  int k) { 
        if(k==0){
            
        return dq.removeFirst();
        }
      int x=  dq.removeFirst();
     int y= fn2(k-1);
      dq.addFirst(x);
      return y;
     }
    
    public int popBack() {
        return !dq.isEmpty() ? dq.removeLast():-1;     
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
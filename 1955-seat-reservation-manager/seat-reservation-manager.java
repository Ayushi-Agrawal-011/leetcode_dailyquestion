class SeatManager {
TreeSet<Integer> set;// unreserved seat set
    public SeatManager(int n) {
     set=new TreeSet<>();
     for(int i=1;i<=n;i++){
        set.add(i);
     }
    }
    
    public int reserve() {
       int x=set.first();
       set.remove(x);
       return x;
    }
    
    public void unreserve(int seatNumber) {
    set.add(seatNumber);
        

    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
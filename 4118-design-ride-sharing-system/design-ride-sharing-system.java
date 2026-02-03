class RideSharingSystem {
Queue<Integer> drivers;
Queue<Integer> riders;
    public RideSharingSystem() {
       drivers=new LinkedList<>();
       riders=new LinkedList<>(); 
    }
    
    public void addRider(int riderId) {
        riders.add(riderId);
    }
    
    public void addDriver(int driverId) {
        drivers.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(riders.size()==0 || drivers.size()==0)
        return new int[]{-1,-1};
          int d = drivers.iterator().next();
        int r = riders.iterator().next();
        drivers.remove(d);
        riders.remove(r);
        return new int[]{d, r};
    }
    
    public void cancelRider(int riderId) {
         riders.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
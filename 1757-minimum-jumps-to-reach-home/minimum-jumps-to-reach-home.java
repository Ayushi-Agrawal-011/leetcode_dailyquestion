class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
     HashSet<Integer> rs = new HashSet<>();
for (int t : forbidden) {
    rs.add(t);
}


      Queue<Pair> q = new LinkedList<>();

        HashSet<Integer> visited=new HashSet<>();
     
    q.add(new Pair(0, 0, 0));
        while(!q.isEmpty()){
            Pair rp=q.poll();
            if(visited.contains(rp.cur))
            continue;
            if(rs.contains(rp.cur) || rp.cur<0)
            continue;
         if(rp.cur==x)
         return rp.jumps;
          int fwd = rp.cur + a;
            int fwdKey = fwd * 10000 + 0;
            if (fwd <= 6000 && !rs.contains(fwd) && !visited.contains(fwdKey)) {
                visited.add(fwdKey);
                q.add(new Pair(fwd, 0, rp.jumps + 1));
            }

            // ---------- backward jump ----------
            int back = rp.cur - b;
            int backKey = back * 10000 + 1;
            if (rp.step == 0 && back >= 0 && !rs.contains(back) && !visited.contains(backKey)) {
                visited.add(backKey);
                q.add(new Pair(back, 1, rp.jumps + 1));
            }
        }
        
        return -1;
    }
    class Pair{
        int cur;
        int step;
        int jumps;
        public Pair(int cur,int step,int jumps){
            this.cur=cur;
            this.step=step;
            this.jumps=jumps;
        }
    }
}
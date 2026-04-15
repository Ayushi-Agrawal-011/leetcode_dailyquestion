class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.si==b.si)?(a.f-b.f):(a.si-b.si));
       for(int i=0;i<times.length;i++){
        pq.add(new Pair(times[i][0],times[i][1],i,-1));
       }
       PriorityQueue<Integer> free=new PriorityQueue<>();
       for(int i=0;i<times.length;i++){
        free.add(i);
       }
        PriorityQueue<Pair> occupied=new PriorityQueue<>((a,b)->(a.ei-b.ei));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            //occupied wali jinka time khatam hua unko free chairs mein add
            while(!occupied.isEmpty() && occupied.peek().ei<=curr.si){
                free.add(occupied.poll().chair);
            }
            //smallest chair assign
            int ch=free.poll();
            curr.chair=ch;
            // agar target wlai ko mile toh retunr chair number
            if(curr.f==targetFriend)
            return curr.chair;
            occupied.add(curr);
        }
        return -1;

    }
    class Pair{
        int si,ei,f,chair;
        public Pair(int si,int ei,int f,int chair){
            this.si=si;
            this.ei=ei;
            this.f=f;
            this.chair=chair;
        }
    }
}
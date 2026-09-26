class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:gifts){
            pq.add((long)x);
        }
        while(!pq.isEmpty() && k>0){
        long r=pq.poll();
            r=(long)Math.sqrt(r);
            pq.add(r);
            k--;
        }
      long ans=0;
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
    }
}
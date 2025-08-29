class Solution {
    public long maxKelements(int[] nums, int k) {
          PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
          long ans=0;
          for(int x:nums){
            pq.add(x);
          }
          while(k-->0){
            int a=pq.poll();
            ans+=a;
            pq.add((int)(Math.ceil((double)a/3)));
          }
          return ans;
    }
}
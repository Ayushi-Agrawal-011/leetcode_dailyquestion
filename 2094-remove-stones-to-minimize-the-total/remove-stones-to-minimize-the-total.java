class Solution {
    public int minStoneSum(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
          long ans=0;
          for(int x:nums){
            pq.add(x);
          }
          while(k-->0){
            int a=pq.poll();
       
            pq.add(a-(int)(Math.floor((double)a/2)));
          }
          while(!pq.isEmpty()){
            ans+=pq.poll();
          }
          return(int) ans;
    }
}
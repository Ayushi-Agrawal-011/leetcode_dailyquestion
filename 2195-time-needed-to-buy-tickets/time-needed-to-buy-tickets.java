class Solution {
      public int timeRequiredToBuy(int[] nums, int k) {
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
        q.add(new Pair(i,nums[i]));
        }
        int c=0;
        while(!q.isEmpty()){
            Pair rp=q.poll();
            rp.tickets=rp.tickets-1;
            c++;
            if(rp.i==k && rp.tickets==0)
            return c;
            if(rp.tickets>0)
            q.add(new Pair(rp.i,rp.tickets));
        }
return c;
    }
    class Pair{
        int i;
        int tickets;
        public Pair(int i,int tickets){
            this.i=i;
            this.tickets=tickets;
        }
    }

   
}
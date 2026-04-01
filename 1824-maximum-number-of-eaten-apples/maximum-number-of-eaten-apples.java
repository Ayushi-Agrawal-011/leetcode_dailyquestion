class Solution {
    public int eatenApples(int[] apples, int[] days) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.rotday-b.rotday));
     int i=0;
     int n=days.length;
   
     int c=0;
     int cd=0;  
     while(cd<n || !pq.isEmpty()){
        if(cd<n && apples[cd]>0){
            pq.add(new Pair(cd+days[cd],apples[cd]));
        }
        while(!pq.isEmpty() && pq.peek().rotday<=cd){
            pq.poll();
        }
        if(!pq.isEmpty()){
           Pair rp=pq.poll();
           c++;
           if(rp.apples>1){
             pq.add(new Pair(rp.rotday, rp.apples - 1));
           }
           
        }
        cd++;}
     return c;

    }
    class Pair{
    
        int rotday;
        int apples;
        public Pair(int rotday,int apples){
            this.rotday=rotday;
            this.apples=apples;
        }
    }
}
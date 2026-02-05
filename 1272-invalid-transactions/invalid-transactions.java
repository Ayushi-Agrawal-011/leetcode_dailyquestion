class Solution {
    class trans{
        String name;
        int time;
        int amount;
        String city;
        public trans(String line){
            String[]st=line.split(",");
            this.name=st[0];
               this.time=Integer.parseInt(st[1]);
               this.amount=Integer.parseInt(st[2]);
                this.city=st[3];

        }
    }
    public List<String> invalidTransactions(String[] transactions) {
        List<String> ll=new ArrayList<>();
        Map<String,List<trans>> map=new HashMap<>();
        for(String t:transactions){
            trans tt=new trans(t);
             map.computeIfAbsent(tt.name, k -> new ArrayList<>()).add(tt);
          
        }
    for(String t:transactions){
          trans tt=new trans(t);
          if(!isvalid(tt,map.getOrDefault(tt.name,new ArrayList<>()))){
            ll.add(t);
          }
    }
    return ll;
    }
    public boolean isvalid(trans t,List<trans> ll){
        if(t.amount>1000)
        return false;
        for(trans tb:ll){
            if(Math.abs(tb.time-t.time)<=60 && !tb.city.equals(t.city))
            return false;
        }
        return true;
    }
}
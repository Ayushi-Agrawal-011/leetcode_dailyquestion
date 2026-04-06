class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        Queue<Pair> q=new LinkedList<>();

        Set<String> visited=new HashSet<>();
        q.add(new Pair(0,0));
        while(!q.isEmpty()){
            Pair rp=q.poll();
            if(rp.x==target || rp.y==target|| rp.x+rp.y==target){

                return true;
            }
            String ans=rp.x+","+rp.y;
            if(visited.contains(ans))
            continue;
            visited.add(ans);
            if(rp.x<x){
                q.add(new Pair(x,rp.y));
            }
            if(rp.y<y){
                q.add(new Pair(rp.x,y));
            }
        if(rp.x>0)
          q.add(new Pair(0,rp.y));
        
         if(rp.y>0)
          q.add(new Pair(rp.x,0));
        
    int pourXY = Math.min(rp.x, y - rp.y);
            q.add(new Pair(rp.x - pourXY, rp.y + pourXY));

            // ✅ pour y -> x
            int pourYX = Math.min(rp.y, x - rp.x);
            q.add(new Pair(rp.x + pourYX, rp.y - pourYX));
     
        }
return false;
    }
    class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
class Solution {
    public int minimumRounds(int[] tasks) {
        int ans=0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<tasks.length;i++){

map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int c=0;
        for(int x:map.keySet()){
            int v=map.get(x);
            if(v<2)
            return -1;
            while(v>=3){
                
            if (v - 3 == 1) 
            { v -= 4; 
            c += 2; 
            } 
            else { v -= 3; 
            c++; 
            }
            }
           if(v==2){
               v-=2;
                c++;
            }
            if(v>0)
            return -1;

        }
        return c;
    }
}
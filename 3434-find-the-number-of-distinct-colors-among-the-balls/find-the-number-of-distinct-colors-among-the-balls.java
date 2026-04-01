class Solution {
    public int[] queryResults(int limit, int[][] queries) {
   
        Map<Integer, Integer> ball = new HashMap<>();
        Map<Integer, Integer> color = new HashMap<>();

    int i=0;
    int[]result=new int[queries.length];
    for(int[]arr:queries){
       int x=arr[0];
       int y=arr[1];
       if(ball.containsKey(x)){
        int old=ball.get(x);
        color.put(old,color.getOrDefault(old,0)-1);
        if(color.get(old)==0)
        color.remove(old);

       }
       ball.put(x,y);
 color.put(y,color.getOrDefault(y,0)+1);
 result[i]=color.size();
 i++;


    }
    return result;
    }
}
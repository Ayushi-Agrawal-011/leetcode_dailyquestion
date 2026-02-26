class Solution {
    public int edgeScore(int[] edges) {
        long[]score=new long[edges.length];
        for(int i=0;i<edges.length;i++){
           score[edges[i]]+=i;
        }
        long max=Arrays.stream(score).max().getAsLong();
        
        for(int i=0;i<score.length;i++){
            if(score[i]==max){
                return i;
            }
        }
        return -1;
    }
}
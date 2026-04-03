class Solution {
    public int minCostToMoveChips(int[] position) {
        int c=0,d=0;
        for(int x:position){
            if(x%2==0)
            c++;
            else
            d++;
        }
        return Math.min(c,d);
    }
}
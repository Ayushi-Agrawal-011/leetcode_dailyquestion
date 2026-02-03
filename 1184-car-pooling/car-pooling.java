class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[]diff=new int[1001];
        for(int[]ar:trips){
            diff[ar[1]]+=ar[0];
            diff[ar[2]]-=ar[0];
        }
        int c=0;
        for(int p:diff){
            c+=p;
            if(c>capacity)
            return false;
        }
        return true;
    }
}
class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx &&  sy==fy)
        return t!=1;
        int x=Math.abs(sx-fx);
        int y=Math.abs(sy-fy);
        return x<=t && y<=t;
    }
}
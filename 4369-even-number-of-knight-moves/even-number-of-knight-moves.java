class Solution {
    public boolean canReach(int[] start, int[] target) {
        int si=start[0]+start[1];
        int ei=target[0]+target[1];
        if(si%2==0 && ei%2==0)
        return true;
          if(si%2!=0 && ei%2!=0)
        return true;
        return false;
    }
}
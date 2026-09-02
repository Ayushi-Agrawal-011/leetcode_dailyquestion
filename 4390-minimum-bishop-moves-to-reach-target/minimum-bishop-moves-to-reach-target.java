class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int row=source[0]+source[1];
        int col=target[0]+target[1];
        if(row%2!=col%2)
        return -1;
        if(Math.abs(source[0]-target[0]) ==Math.abs(source[1]-target[1]))
        return 1;
        return 2;
    }
}
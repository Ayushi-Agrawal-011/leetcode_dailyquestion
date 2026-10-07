class Solution {
    public int minQueenMoves(int[] source, int[] target) {
   int sx=source[0];
   int sy=source[1];
   int tx=target[0];
   int ty=target[1];
   if(sx==tx && sy==ty)
   return 0;
   if(sx==tx || sy==ty || Math.abs(tx-sx) ==Math.abs(sy-ty))
   return 1;
   return 2;
    }
}
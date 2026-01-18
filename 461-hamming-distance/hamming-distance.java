class Solution {
    public int hammingDistance(int x, int y) {
   int c=0;
   int xor=x^y;
   while(xor>0){
  c++;
  xor=xor&(xor-1);
   }
   return c;
    }
}
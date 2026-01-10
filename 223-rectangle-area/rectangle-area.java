class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
      int a1=(ax2-ax1)*(ay2-ay1);
      int a2=(bx2-bx1)*(by2-by1);
      int a=Math.max(ax1,bx1);
      int b=Math.max(ay1,by1);
      int c= Math.min(ax2,bx2);
      int d=Math.min(ay2,by2);
      int a3=(c-a)*(d-b);
      if((c-a)<0 || (d-b)<0)
      a3=0;
      return a1+a2-a3;
    }
}
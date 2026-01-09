class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a1=(C-A)*(D-B);
        int a2=(G-E)*(H-F);
        int a=Math.max(A,E);
        int b=Math.max(B,F);
        int c=Math.min(C,G);
        int d=Math.min(D,H);
       
    int a3=(c-a)*(d-b);
     if((c-a)<0 || (d-b)<0)
        a3=0;
return a1+a2-a3;
    }
}
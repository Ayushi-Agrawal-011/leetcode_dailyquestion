class Solution {
    public int removeBoxes(int[] boxes) {
        int n=boxes.length;
        int[][][]dp=new int[n][n][n];
        return fn(boxes,0,n-1,0,dp);
    }
    public int fn(int[]boxes,int i,int j,int k,int[][][]dp){
        if(i>j)
        return 0;
        if(dp[i][j][k]!=0)
        return dp[i][j][k];
        int max=(k+1)*(k+1)+fn(boxes,i+1,j,0,dp);
        for(int p=i+1;p<=j;p++){
            if(boxes[i]==boxes[p]){
                int removemiddle=fn(boxes,i+1,p-1,0,dp);
                int mergeLater=fn(boxes,p,j,k+1,dp);
                max=Math.max(max,removemiddle+mergeLater);
            }
        }
        return dp[i][j][k]=max;
    }
}
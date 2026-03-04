class Solution {
    public int numSpecial(int[][] mat) {
        int c=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(isspeacial(mat,i,j)){
                    c++;
                    }
                }
            }
        }
        return c;
    }
    public boolean isspeacial(int[][]mat,int i,int j){
        for(int p=0;p<mat[0].length;p++){
if(p!=j && mat[i][p]==1)
return false;
        }
         for(int p=0;p<mat.length;p++){
if(p!=i && mat[p][j]==1)
return false;
        }
        return true;
    }
}
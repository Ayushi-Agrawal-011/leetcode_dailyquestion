class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int a=image[sr][sc];
        if(a==color)
        return image;
       fn(image,sr,sc,a,color);
       return image; 
    }
    public void fn(int[][] image, int sr, int sc, int a,int color){
        if(sr<0 ||sc<0 || sr>=image.length || sc>=image[0].length)
        return;
        if(a!=image[sr][sc])
        return;
        image[sr][sc]=color;
        fn(image,sr-1,sc,a,color);
        fn(image,sr+1,sc,a,color);
        fn(image,sr,sc-1,a,color);
        fn(image,sr,sc+1,a,color);
    }
}
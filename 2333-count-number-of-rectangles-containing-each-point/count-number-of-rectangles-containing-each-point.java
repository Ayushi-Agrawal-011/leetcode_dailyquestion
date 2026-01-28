class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {

        Arrays.sort(rectangles,(a,b)->(b[0]-a[0]));
     
int[][]arr=new int[points.length][3];

       for(int i=0;i<points.length;i++){
        arr[i][0]=points[i][0];
        arr[i][1]=points[i][1];
        arr[i][2]=i;
       }

       
       Arrays.sort(arr,(a,b)->(b[0]-a[0]));
      
       int[]hc=new int[101];

      int []ans=new int[points.length];
        int i=0;
        for(int[]a:arr){
            int t=a[0];
            int b=a[1];
            int c=a[2];
            while(i<rectangles.length && rectangles[i][0]>=t){
                hc[rectangles[i][1]]++;
                i++;
            }
            int count=0;
           for(int j=b;j<101;j++){
            count+=hc[j];
           }
           ans[c]=count;
        }
        return ans;
    }
}

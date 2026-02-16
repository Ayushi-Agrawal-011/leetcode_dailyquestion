class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[]ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            int c=1;
            while(a!=b){
          if(b>a)
          b=b/2;
          else
          a=a/2;
          c++;
            }
            ans[i]=c;
        }
        return  ans;
    }
}
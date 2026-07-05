class Solution {
    public int numberOfChild(int n, int k) {
        boolean isstart=false,isend=false;
        int c=0;
        int i=0;
        while(c<k){
            if(i==0){
                isstart=true;
                isend=false;
              i++;
            }
            else if(i==n-1){
                isstart=false;
                isend=true;
                i--;
            }
            else{
                if(isstart)
                i++;
                else
                i--;
            }
c++;
        }
        return i;
    }
}
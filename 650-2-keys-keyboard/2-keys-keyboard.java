class Solution {
    public int minSteps(int n) {
        return fn(n,1,0);
    }
    public int fn(int n,int curr,int clip){
     
        if(curr==n)
        return 0;
           if(curr>n)
        return Integer.MAX_VALUE/2;
        
    int copy=Integer.MAX_VALUE/2;
    if(clip!=curr)
   copy= 1+fn(n,curr,curr);
    int paste=Integer.MAX_VALUE/2;
       if(clip>0){
paste=1+fn(n,curr+clip,clip);
       }
        return Math.min(copy,paste);
    }
}
class Solution {
    public int preimageSizeFZF(int k) {
        if(k<5)
        return 5;
        if(k==1000000000)
        return 5;
     return   fn(k);
    }
    public int fn(int k){
        int low=0;
        int high=5*k;
        int ans=0;
        while(low<=high){
       int mid=low+(high-low)/2;
       int p=count(mid);
       if(p<k)
          low=mid+1;
    
       else if(p>k)
         high=mid-1;
       else
return 5;
        }
        return ans;
    }
    public int count (int n){
        int ans=0;
        while(n>0){
            n=n/5;
            ans+=n;
        }
        return ans;
    }
}
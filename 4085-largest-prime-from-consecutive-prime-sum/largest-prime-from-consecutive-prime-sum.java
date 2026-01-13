class Solution {
    public int largestPrime(int n) {
        if(n<2)
        return 0;
        if(n==2)
        return n;
 return       fn(n);
    }
	    public static  int fn(int n){
	        int[]ans=new int[n+1];
	        ans[0]=1;
	        ans[1]=1;
	        for(int i=2;i*i<=n;i++){
	            if(ans[i]==0){
	                for(int j=i*i;j<=n;j+=i){
	                    
	                    ans[j]=1;
	                }
	            }
	        }
	       int sum=0;
           int max=0;
	        for(int i=2;i<=n;i++){
	            if(ans[i]==0){
                    sum+=i;
                    if(sum>n)
                    break;
                    if(ans[sum]==0)
                    max=sum;
          
                }
	        }
	        return max;
	    }
}
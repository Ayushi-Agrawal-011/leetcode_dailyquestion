class Solution { 
    public int preimageSizeFZF(int k) { 
        if(k < 5) 
            return 5; 
        
        return fn(k); 
    } 

    public int fn(int k){ 
        long low=0; 
        long high=5L*k; 
        
        while(low<=high){ 
            long mid=low+(high-low)/2; 
            long p=count(mid); 
            
            if(p<k) 
                low=mid+1; 
            else if(p>k) 
                high=mid-1; 
            else 
                return 5; 
        } 
        
        return 0; 
    } 

    public long count(long n){ 
        long ans=0; 
        
        while(n>0){ 
            n=n/5; 
            ans+=n; 
        } 
        
        return ans; 
    } 
}
class Solution {
    public int minOperations(int[] nums) {
       int ans=0;
       for(int i=0;i<nums.length;i++){
        int curr=nums[i];
        if(i%2!=0){
            while(isprime(curr)){
                curr++;
                ans++;
            }
        }
        else{
           while(!isprime(curr)){
                curr++;
                ans++;
            } 
        }
       }
       return ans; 
    }
    public boolean isprime(int n){
        if(n<=1)
        return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
}
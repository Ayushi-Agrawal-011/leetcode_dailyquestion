class Solution {
    public int minAllOneMultiple(int k) {
        if(k%2==0 || k%5==0)
        return -1;
        int n=1;
        int ans=1;
        while(n!=0){
            n=(n*10+1)%k;
ans++;
        }
        return ans;
    }
}
class Solution {
    public int findMinMoves(int[] machines) {
        int sum=Arrays.stream(machines).sum();
        int n=machines.length;
        if(sum %n!=0)
        return -1;
        int ans=0,balance=0;
        int avg=sum/n;
        for(int i=0;i<n;i++){
            int diff=machines[i]-avg;
            balance+=diff;
            
            ans=Math.max(ans,Math.max(diff,Math.abs(balance)));
        }
        return ans;
    }
}
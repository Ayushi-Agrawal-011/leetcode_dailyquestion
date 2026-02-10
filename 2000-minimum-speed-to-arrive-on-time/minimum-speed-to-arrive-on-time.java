class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int  si=1;
        int ei=(int)1e7;
        int  ans=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(isitpossible(dist,hour,mid)){
                ans=mid;
                ei=mid-1;
            }
            else
            si=mid+1;
        }
        return ans;

    }
    public boolean isitpossible(int[]dist,double hours,int speed){
        double ans=0;
        int n=dist.length;
        for(int i=0;i<n;i++){
            double time=dist[i]*1.0/speed;
            if(i!=n-1)
            ans=ans+Math.ceil(time);
            else
            ans+=time;
            if(ans>hours)
            return false;
        }
        return ans<=hours;
    }
}
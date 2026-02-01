class Solution {
    public int jobScheduling(int[] start, int[] end, int[] profit) {
     int n=start.length;
     Pair[] jobs=new Pair[n];
     int[]dp=new int[n];
     Arrays.fill(dp,-1);
     for(int i=0;i<n;i++){
        jobs[i]=new Pair(start[i],end[i],profit[i]);
     }
      Arrays.sort(jobs, (a, b) -> a.si == b.si ? a.ei - b.ei : a.si - b.si);
      return fn(jobs,dp,0);
    }
    public int fn(Pair[]jobs,int[]dp,int i){
        if(i>=jobs.length)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int j=i+1;
        while(j<jobs.length && jobs[j].si<jobs[i].ei){
            j++;
        }
        return dp[i]=Math.max(fn(jobs,dp,j)+jobs[i].profit,fn(jobs,dp,i+1));
    }
    class Pair{
        int si;
        int ei;
        int profit;
        public Pair(int si,int ei,int profit){
            this.si=si;
            this.ei=ei;
            this.profit=profit;
        }
    }
}
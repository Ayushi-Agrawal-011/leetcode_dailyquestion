class Solution {
    public int mincostTickets(int[] days, int[] costs) {
      int n=days.length;
       int[]dp=new int[n];
       Arrays.fill(dp,-1);
       return fn(days,costs,0,dp); 
    }
    public int fn(int[]days,int[]cost,int i,int[]dp){
        int next=i;
        if(i>=days.length)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int one=cost[0]+fn(days,cost,i+1,dp);
        while(next<days.length && days[next]<days[i]+7){
            next++;
        }
        int seven=cost[1]+fn(days,cost,next,dp);
           while(next<days.length && days[next]<days[i]+30){
            next++;
        }
         int thirty=cost[2]+fn(days,cost,next,dp);
         return dp[i]=Math.min(one,Math.min(seven,thirty));
    }
}
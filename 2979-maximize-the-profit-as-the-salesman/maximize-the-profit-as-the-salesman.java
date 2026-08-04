class Solution {
    public int maximizeTheProfit(int n, List<List<Integer>> offers) {
    
        int[]dp=new int[offers.size()];
        Collections.sort(offers,(a,b)->(a.get(0)-b.get(0)));
        Arrays.fill(dp,-1);
        return fn(offers,0,dp);
    }
    public int fn(List<List<Integer>> offers,int i,int[]dp){
        if(i==offers.size())
        return 0;
        if(dp[i]!=-1)
        return dp[i];
          int next = findNext(i,offers);
        int a=offers.get(i).get(2)+fn(offers,next,dp);
        int b=fn(offers,i+1,dp);
        return dp[i]=Math.max(a,b);
    }
    public int findNext(int i, List<List<Integer>> offers) {

    int end = offers.get(i).get(1);

    int l = i + 1;
    int r = offers.size() - 1;
    int ans = offers.size();

    while (l <= r) {

        int mid = l + (r - l) / 2;

        if (offers.get(mid).get(0) > end) {
            ans = mid;
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    return ans;
}
}
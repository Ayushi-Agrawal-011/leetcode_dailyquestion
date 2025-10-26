class Solution {
    public int maxProfit(int[] prices) {
        int sell=0,prev_sell=0;
        int buy=Integer.MIN_VALUE,prev_buy;
        for(int p:prices){
            prev_buy=buy;
            buy=Math.max(prev_sell-p,prev_buy);
            prev_sell=sell;
            sell=Math.max(prev_buy+p,prev_sell);
        }
        return sell;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int mn = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            mn = Math.min(prices[i],mn);
            profit = Math.max(profit,prices[i]-mn);
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int mn = Integer.MAX_VALUE;
        int profit = 0;
        for(int stock:prices){
            mn = Math.min(stock,mn);
            profit = Math.max(profit,stock-mn);
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int minBuyPrice = prices[0];
        int maxProfitSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minBuyPrice;
            if(profit > maxProfitSoFar){
                maxProfitSoFar = profit;
            }
            if(minBuyPrice > prices[i]){
                minBuyPrice = prices[i];
            }
        }
        return maxProfitSoFar;
    }
}
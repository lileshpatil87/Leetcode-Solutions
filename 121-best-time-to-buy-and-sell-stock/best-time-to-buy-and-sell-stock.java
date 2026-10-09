class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int crrmin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < crrmin) {
                crrmin = prices[i];
            }
            mp = Math.max(prices[i] - crrmin, mp);
        }
        return mp;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n < 2) {
            return 0;
        }

        int[] minStorage = new int[n];
        minStorage[0] = prices[0];
        for (int i = 1; i < n; i++) {
            minStorage[i] = Math.min(minStorage[i - 1], prices[i]);
        }

        int profit = 0;
        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, prices[i] - minStorage[i - 1]);
        }

        return profit;
    }
}

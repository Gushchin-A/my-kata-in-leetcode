class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 1) {
            return 0;
        }

        int profit = 0;
        int minCost = prices[0];
        for (int i = 0; i < n; i++) {
            int maxCost = prices[i];
            if (prices[i] < minCost) {
                minCost = prices[i];
            }
            if (profit < maxCost - minCost) {
                profit = maxCost - minCost;
            }
        }

        return profit;
    }
}

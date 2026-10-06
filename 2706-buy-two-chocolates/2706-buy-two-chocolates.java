class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int balance = money - prices[0] - prices[1];

        return balance >= 0 ? balance : money;
    }
}
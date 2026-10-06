class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int balance = money;
        int chocolates = 0;
        for (int price : prices) {
            balance -= price;
            chocolates++;

            if (chocolates == 2) {
                break;
            }
        }

        return balance >= 0 ? balance : money;
    }
}
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int allEmpty = numBottles;
        int maxCanDrink = 0;

        while (allEmpty >= numExchange) {
            maxCanDrink += allEmpty / numExchange;
            allEmpty = (allEmpty / numExchange) + (allEmpty % numExchange);
        }

        return numBottles + maxCanDrink;
    }
}